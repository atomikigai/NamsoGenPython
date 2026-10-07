package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f1065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f1066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f1067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f1068d;
    public static final m e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m[] f1069f;

    static {
        m mVar = new m("DESTROYED", 0);
        f1065a = mVar;
        m mVar2 = new m("INITIALIZED", 1);
        f1066b = mVar2;
        m mVar3 = new m("CREATED", 2);
        f1067c = mVar3;
        m mVar4 = new m("STARTED", 3);
        f1068d = mVar4;
        m mVar5 = new m("RESUMED", 4);
        e = mVar5;
        f1069f = new m[]{mVar, mVar2, mVar3, mVar4, mVar5};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f1069f.clone();
    }
}
