package y1;

import fa.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f10511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f10512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f10513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u[] f10514d;

    static {
        u uVar = new u("AUTOMATIC", 0);
        f10511a = uVar;
        u uVar2 = new u("TRUNCATE", 1);
        f10512b = uVar2;
        u uVar3 = new u("WRITE_AHEAD_LOGGING", 2);
        f10513c = uVar3;
        u[] uVarArr = {uVar, uVar2, uVar3};
        f10514d = uVarArr;
        c1.s(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f10514d.clone();
    }
}
