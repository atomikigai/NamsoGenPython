package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public class i implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f5450f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.q f5451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f5454d;
    public final int e;

    public i(j$.time.temporal.q qVar, int i, int i10, u uVar) {
        this.f5451a = qVar;
        this.f5452b = i;
        this.f5453c = i10;
        this.f5454d = uVar;
        this.e = 0;
    }

    public i(j$.time.temporal.q qVar, int i, int i10, u uVar, int i11) {
        this.f5451a = qVar;
        this.f5452b = i;
        this.f5453c = i10;
        this.f5454d = uVar;
        this.e = i11;
    }

    public i a() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.f5451a, this.f5452b, this.f5453c, this.f5454d, -1);
    }

    public i b(int i) {
        return new i(this.f5451a, this.f5452b, this.f5453c, this.f5454d, this.e + i);
    }

    @Override // j$.time.format.f
    public boolean u(p pVar, StringBuilder sb2) {
        j$.time.temporal.q qVar = this.f5451a;
        Long lA = pVar.a(qVar);
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        s sVar = pVar.f5475b.f5439c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i = this.f5453c;
        if (length > i) {
            throw new j$.time.a("Field " + qVar + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i);
        }
        sVar.getClass();
        int i10 = this.f5452b;
        u uVar = this.f5454d;
        if (jLongValue >= 0) {
            int i11 = c.f5444a[uVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    sb2.append('+');
                }
            } else if (i10 < 19 && jLongValue >= f5450f[i10]) {
                sb2.append('+');
            }
        } else {
            int i12 = c.f5444a[uVar.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                sb2.append('-');
            } else if (i12 == 4) {
                throw new j$.time.a("Field " + qVar + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i13 = 0; i13 < i10 - string.length(); i13++) {
            sb2.append('0');
        }
        sb2.append(string);
        return true;
    }

    public String toString() {
        int i = this.f5453c;
        j$.time.temporal.q qVar = this.f5451a;
        u uVar = this.f5454d;
        int i10 = this.f5452b;
        if (i10 == 1 && i == 19 && uVar == u.NORMAL) {
            return "Value(" + qVar + ")";
        }
        if (i10 == i && uVar == u.NOT_NEGATIVE) {
            return "Value(" + qVar + "," + i10 + ")";
        }
        return "Value(" + qVar + "," + i10 + "," + i + "," + uVar + ")";
    }
}
