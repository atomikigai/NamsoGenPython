package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class v1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r1 f722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s1 f723d;
    public static final t1 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ v1[] f724f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f726b;

    /* JADX INFO: Fake field, exist only in values array */
    v1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    v1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    v1 EF2;

    static {
        v1 v1Var = new v1("DOUBLE", 0, w1.f734d, 1);
        v1 v1Var2 = new v1("FLOAT", 1, w1.f733c, 5);
        w1 w1Var = w1.f732b;
        v1 v1Var3 = new v1("INT64", 2, w1Var, 0);
        v1 v1Var4 = new v1("UINT64", 3, w1Var, 0);
        w1 w1Var2 = w1.f731a;
        v1 v1Var5 = new v1("INT32", 4, w1Var2, 0);
        v1 v1Var6 = new v1("FIXED64", 5, w1Var, 1);
        v1 v1Var7 = new v1("FIXED32", 6, w1Var2, 5);
        v1 v1Var8 = new v1("BOOL", 7, w1.e, 0);
        r1 r1Var = new r1("STRING", 8, w1.f735f, 2);
        f722c = r1Var;
        w1 w1Var3 = w1.f738t;
        s1 s1Var = new s1("GROUP", 9, w1Var3, 3);
        f723d = s1Var;
        t1 t1Var = new t1("MESSAGE", 10, w1Var3, 2);
        e = t1Var;
        f724f = new v1[]{v1Var, v1Var2, v1Var3, v1Var4, v1Var5, v1Var6, v1Var7, v1Var8, r1Var, s1Var, t1Var, new u1("BYTES", 11, w1.f736r, 2), new v1("UINT32", 12, w1Var2, 0), new v1("ENUM", 13, w1.f737s, 0), new v1("SFIXED32", 14, w1Var2, 5), new v1("SFIXED64", 15, w1Var, 1), new v1("SINT32", 16, w1Var2, 0), new v1("SINT64", 17, w1Var, 0)};
    }

    public v1(String str, int i, w1 w1Var, int i10) {
        super(str, i);
        this.f725a = w1Var;
        this.f726b = i10;
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) f724f.clone();
    }
}
