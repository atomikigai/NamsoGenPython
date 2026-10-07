package i5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f5210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f5211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f5212d;

    static {
        c cVar = new c("DEFAULT", 0);
        f5209a = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        f5210b = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        f5211c = cVar3;
        f5212d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5212d.clone();
    }
}
