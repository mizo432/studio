package jp.or.venuspj.image.core.model;

public class MobyletSessionHolder implements SessionHolder, MobyletSessionTouchListener{
    protected HashMap<String, MobyletSession> holder = new HashMap<String, MobyletSession>();

    protected LinkedList<MobyletSession> linkedSession = new LinkedList<MobyletSession>();

    protected int timeSpan = 60000;

    @Override
    public <T> T get(String uid, Class<T> clazz) {
        MobyletSession session = getSession(uid);
        if (session != null) {
            return session.get(clazz);
        }
        return null;
    }

    @Override
    public <T> T remove(String uid, Class<T> clazz) {
        MobyletSession session = getSession(uid);
        if (session != null) {
            return session.remove(clazz);
        }
        return null;
    }

    @Override
    public <T> void set(String uid, T obj) {
        if (uid != null) {
            MobyletSession session = getSession(uid);
            if (session == null) {
                session = new MobyletSession(uid);
                session.setTouchListener(this);
                session.touch();
                holder.put(uid, session);
            }
            session.put(obj);
        }
    }

    @Override
    public void invalidate(String uid) {
        MobyletSession session = holder.remove(uid);
        linkedSession.remove(session);
    }

    protected void processClean() {
        MobyletSessionConfig config = SingletonUtils.get(MobyletSessionConfig.class);
        Long expiredTime = System.currentTimeMillis() - ((long)config.getTimeout() * timeSpan);
        MobyletSession session = null;
        while (((session = linkedSession.peek()) != null) &&
                (session.getTouchTime() < expiredTime)) {
            linkedSession.poll();
        }
    }

    protected MobyletSession getSession(String uid) {
        processClean();
        if (uid != null) {
            MobyletSession session = holder.remove(uid);
            if (session == null) {
                return null;
            }
            MobyletSessionConfig config = SingletonUtils.get(MobyletSessionConfig.class);
            Long expiredTime = System.currentTimeMillis() - ((long)config.getTimeout() * timeSpan);
            if (session.getTouchTime() < expiredTime) {
                linkedSession.remove(session);
                return null;
            } else {
                session.touch();
                holder.put(uid, session);
                return session;
            }
        }
        return null;
    }

    @Override
    public void actionTouch(MobyletSession session) {
        if (linkedSession.remove(session)) {
            linkedSession.add(session);
        }
    }
}
