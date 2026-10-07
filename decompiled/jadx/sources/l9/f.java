package l9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f6875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f6876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f6877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f6878d;

    static {
        f fVar = new f("UNKNOWN", 0);
        f6875a = fVar;
        f fVar2 = new f("NOT_REQUIRED", 1);
        f6876b = fVar2;
        f fVar3 = new f("REQUIRED", 2);
        f6877c = fVar3;
        f6878d = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f6878d.clone();
    }
}
