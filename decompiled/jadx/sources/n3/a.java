package n3;

import fa.c1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 n3.a[], still in use, count: 1, list:
  (r0v1 n3.a[]) from 0x0061: INVOKE (r0v1 n3.a[]) STATIC call: fa.c1.s(java.lang.Enum[]):bc.b A[MD:(java.lang.Enum[]):bc.b (m)] (LINE:98)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    f7228c("AMEX", 4),
    f7229d("VISA", 3),
    e("MASTERCARD", 3),
    f7230f("DISCOVER", 3),
    f7231r("JCB", 3),
    f7232s("DINERS", 3),
    f7233t("UNIONPAY", 3),
    f7234u("UNKNOWN", 3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7237b;

    static {
        c1.s(aVarArr);
    }

    public a(String str, int i) {
        super(str, i);
        this.f7236a = i;
        this.f7237b = i;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7235v.clone();
    }
}
