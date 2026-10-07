package u3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f8845d;

    static {
        a aVar = new a("PREFER_ARGB_8888", 0);
        f8842a = aVar;
        a aVar2 = new a("PREFER_RGB_565", 1);
        f8843b = aVar2;
        f8845d = new a[]{aVar, aVar2};
        f8844c = aVar;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f8845d.clone();
    }
}
