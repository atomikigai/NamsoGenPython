package y1;

import fa.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f10413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f10414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a0[] f10415c;

    static {
        a0 a0Var = new a0("DEFERRED", 0);
        f10413a = a0Var;
        a0 a0Var2 = new a0("IMMEDIATE", 1);
        f10414b = a0Var2;
        a0[] a0VarArr = {a0Var, a0Var2, new a0("EXCLUSIVE", 2)};
        f10415c = a0VarArr;
        c1.s(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f10415c.clone();
    }
}
