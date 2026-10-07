package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f749d;
    public static final y e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f750f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y f751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y f753t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final y f754u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ y[] f755v;

    static {
        y yVar = new y("VOID", 0);
        f746a = yVar;
        y yVar2 = new y("INT", 1);
        f747b = yVar2;
        y yVar3 = new y("LONG", 2);
        f748c = yVar3;
        y yVar4 = new y("FLOAT", 3);
        f749d = yVar4;
        y yVar5 = new y("DOUBLE", 4);
        e = yVar5;
        y yVar6 = new y("BOOLEAN", 5);
        f750f = yVar6;
        y yVar7 = new y("STRING", 6);
        f751r = yVar7;
        f fVar = f.f631c;
        y yVar8 = new y("BYTE_STRING", 7);
        f752s = yVar8;
        y yVar9 = new y("ENUM", 8);
        f753t = yVar9;
        y yVar10 = new y("MESSAGE", 9);
        f754u = yVar10;
        f755v = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9, yVar10};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f755v.clone();
    }
}
