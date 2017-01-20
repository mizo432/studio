package jp.or.venuspj.util.assigner;

import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 */
public class Assigner {
    /**
     * senderのクローンを作成する.
     * <pre>
     * シャローコピーとなる。
     * </pre>
     * @param sender 送り元
     * @return 送り元の型と同じ
     */
    @SuppressWarnings("unchecked")
    public static <T> T assign(T sender) {
        try {
            T destination = (T) sender.getClass().newInstance();
            assignTo(sender, destination);
            return destination;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * オブジェクトの各フィルドを送り元から送り先にコピーする。
     * <pre>
     * 送り元のフィールドの値がnullの場合には設定しない。
     * </pre>
     * <pre>
     * 利用方法
     * Person person = personMapper.findById(personId);
     * AdderssId AdderssId = person.getAddress().getAddressId()
     * Address address = addressRepository.findById(personId);
     * Assginer.assignTo(address, person.getAddress());
     * </pre>
     * @param sender 送り元
     * @param destination 送り先
     */
    public static <T> void assignTo(T sender, T destination) {
        Class<? extends Object> inputClazz = sender.getClass();
        List<Field> fields = createFields(inputClazz);
        for (Field field : fields) {
            field.setAccessible(true);
            Object obj;
            try {
                obj = field.get(sender);
                if (obj != null) {
                    field.set(destination, obj);
                }
            } catch (IllegalArgumentException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

    }

    /**
     * オブジェクトの各フィルドを送り元から送り先にコピーする。
     * <pre>
     * 送り元のフィールドの値がnullの場合には設定しない。
     * </pre>
     * <pre>
     * 利用方法
     * Person person = personMapper.findById(personId);
     * AdderssId AdderssId = person.getAddress().getAddressId()
     * Optional<Address> addressOptional = addressRepository.findById(personId);
     * Assginer.assignTo(addressOptional, person.getAddress());
     * </pre>
     * @param senderOptional 送り元
     * @param destination 送り先
     */
    public static <T> void assignTo(Optional<T> senderOptional, T destination) {
        if (senderOptional.isPresent()) {
            assignTo(senderOptional.get(), destination);
        }
    }

    private static List<Field> createFields(Class<? extends Object> entityClass) {
        List<Field> results = Lists.newArrayList();

        for (Class<?> clazz = entityClass; clazz != Object.class; clazz = clazz.getSuperclass()) {
            try {
                Field[] fields = clazz.getDeclaredFields();
                results.addAll(Arrays.asList(fields));
            } catch (SecurityException ex) {
            }
        }

        return results;
    }
}
