package root.general.domain.model.staff;

import com.google.common.collect.ComparisonChain;
import jp.or.venuspj.ddd.model.entity.AbstractEntityIdentifier;

/**
 */
public class StaffIdentification extends AbstractEntityIdentifier<Staff> implements Comparable<StaffIdentification> {
    StaffId staffId;

    public StaffIdentification() {
        super(Staff.class);
    }

    public StaffIdentification(Class<Staff> anEntityClass, StaffId staffId) {
        super(anEntityClass);
    }

    @Override
    public int compareTo(StaffIdentification o) {
        return ComparisonChain
                .start()
                .compare(staffId, o.staffId)
                .result();
    }
}
