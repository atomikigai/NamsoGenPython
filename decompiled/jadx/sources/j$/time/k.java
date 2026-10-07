package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements j$.time.temporal.n, j$.time.temporal.o {
    public static final k APRIL;
    public static final k AUGUST;
    public static final k DECEMBER;
    public static final k FEBRUARY;
    public static final k JANUARY;
    public static final k JULY;
    public static final k JUNE;
    public static final k MARCH;
    public static final k MAY;
    public static final k NOVEMBER;
    public static final k OCTOBER;
    public static final k SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k[] f5492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k[] f5493b;

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f5493b.clone();
    }

    static {
        k kVar = new k("JANUARY", 0);
        JANUARY = kVar;
        k kVar2 = new k("FEBRUARY", 1);
        FEBRUARY = kVar2;
        k kVar3 = new k("MARCH", 2);
        MARCH = kVar3;
        k kVar4 = new k("APRIL", 3);
        APRIL = kVar4;
        k kVar5 = new k("MAY", 4);
        MAY = kVar5;
        k kVar6 = new k("JUNE", 5);
        JUNE = kVar6;
        k kVar7 = new k("JULY", 6);
        JULY = kVar7;
        k kVar8 = new k("AUGUST", 7);
        AUGUST = kVar8;
        k kVar9 = new k("SEPTEMBER", 8);
        SEPTEMBER = kVar9;
        k kVar10 = new k("OCTOBER", 9);
        OCTOBER = kVar10;
        k kVar11 = new k("NOVEMBER", 10);
        NOVEMBER = kVar11;
        k kVar12 = new k("DECEMBER", 11);
        DECEMBER = kVar12;
        f5493b = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12};
        f5492a = values();
    }

    public static k I(int i) {
        if (i < 1 || i > 12) {
            throw new a("Invalid value for MonthOfYear: " + i);
        }
        return f5492a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.MONTH_OF_YEAR;
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.C();
        }
        return super.k(qVar);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return super.e(qVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        return qVar.I(this);
    }

    public final int w(boolean z4) {
        int i = j.f5491a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return z4 ? 29 : 28;
    }

    public final int C() {
        int i = j.f5491a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int u(boolean z4) {
        switch (j.f5491a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z4 ? 1 : 0) + 91;
            case 3:
                return (z4 ? 1 : 0) + 152;
            case 4:
                return (z4 ? 1 : 0) + 244;
            case 5:
                return (z4 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z4 ? 1 : 0) + 60;
            case 8:
                return (z4 ? 1 : 0) + 121;
            case 9:
                return (z4 ? 1 : 0) + 182;
            case 10:
                return (z4 ? 1 : 0) + 213;
            case 11:
                return (z4 ? 1 : 0) + 274;
            default:
                return (z4 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.n
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5535b) {
            return j$.time.chrono.t.f5416c;
        }
        if (aVar == j$.time.temporal.r.f5536c) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.b(aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.p(mVar).equals(j$.time.chrono.t.f5416c)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        return mVar.i(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
