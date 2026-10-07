package j$.time.temporal;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements q {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f5520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f5521b;

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f5521b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final u C() {
                return u.f(90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final boolean u(n nVar) {
                if (!nVar.f(a.DAY_OF_YEAR) || !nVar.f(a.MONTH_OF_YEAR) || !nVar.f(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.f5524a;
                return j$.time.chrono.m.p(nVar).equals(j$.time.chrono.t.f5416c);
            }

            @Override // j$.time.temporal.q
            public final u w(n nVar) {
                if (!u(nVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                long jG = nVar.g(h.QUARTER_OF_YEAR);
                if (jG == 1) {
                    long jG2 = nVar.g(a.YEAR);
                    j$.time.chrono.t.f5416c.getClass();
                    return j$.time.chrono.t.w(jG2) ? u.e(1L, 91L) : u.e(1L, 90L);
                }
                if (jG == 2) {
                    return u.e(1L, 91L);
                }
                if (jG == 3 || jG == 4) {
                    return u.e(1L, 92L);
                }
                return C();
            }

            @Override // j$.time.temporal.q
            public final long I(n nVar) {
                if (!u(nVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                int iE = nVar.e(a.DAY_OF_YEAR);
                int iE2 = nVar.e(a.MONTH_OF_YEAR);
                long jG = nVar.g(a.YEAR);
                int i = (iE2 - 1) / 3;
                j$.time.chrono.t.f5416c.getClass();
                return iE - h.f5520a[i + (j$.time.chrono.t.w(jG) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final m K(m mVar, long j4) {
                long jI = I(mVar);
                C().b(j4, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.i((j4 - jI) + mVar.g(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final u C() {
                return u.e(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final boolean u(n nVar) {
                if (!nVar.f(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.f5524a;
                return j$.time.chrono.m.p(nVar).equals(j$.time.chrono.t.f5416c);
            }

            @Override // j$.time.temporal.q
            public final long I(n nVar) {
                if (!u(nVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return (nVar.g(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.q
            public final u w(n nVar) {
                if (!u(nVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return C();
            }

            @Override // j$.time.temporal.q
            public final m K(m mVar, long j4) {
                long jI = I(mVar);
                C().b(j4, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.i(((j4 - jI) * 3) + mVar.g(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final u C() {
                return u.f(52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final boolean u(n nVar) {
                if (!nVar.f(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.f5524a;
                return j$.time.chrono.m.p(nVar).equals(j$.time.chrono.t.f5416c);
            }

            @Override // j$.time.temporal.q
            public final u w(n nVar) {
                if (!u(nVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return u.e(1L, h.O(h.N(j$.time.f.C(nVar))));
            }

            @Override // j$.time.temporal.q
            public final long I(n nVar) {
                if (!u(nVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.M(j$.time.f.C(nVar));
            }

            @Override // j$.time.temporal.q
            public final m K(m mVar, long j4) {
                C().b(j4, this);
                return mVar.l(Math.subtractExact(j4, I(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.q
            public final u C() {
                return a.YEAR.f5516b;
            }

            @Override // j$.time.temporal.q
            public final boolean u(n nVar) {
                if (!nVar.f(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.f5524a;
                return j$.time.chrono.m.p(nVar).equals(j$.time.chrono.t.f5416c);
            }

            @Override // j$.time.temporal.q
            public final long I(n nVar) {
                if (u(nVar)) {
                    return h.N(j$.time.f.C(nVar));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final u w(n nVar) {
                if (!u(nVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                return C();
            }

            @Override // j$.time.temporal.q
            public final m K(m mVar, long j4) {
                if (!u(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.f5516b.a(j4, h.WEEK_BASED_YEAR);
                j$.time.f fVarC = j$.time.f.C(mVar);
                a aVar = a.DAY_OF_WEEK;
                int iE = fVarC.e(aVar);
                int iM = h.M(fVarC);
                if (iM == 53 && h.O(iA) == 52) {
                    iM = 52;
                }
                j$.time.f fVarP = j$.time.f.P(iA, 1, 4);
                return mVar.j(fVarP.S(((iM - 1) * 7) + (iE - fVarP.e(aVar))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f5521b = new h[]{hVar, hVar2, hVar3, hVar4};
        f5520a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int O(int i) {
        j$.time.f fVarP = j$.time.f.P(i, 1, 1);
        if (fVarP.K() != j$.time.c.THURSDAY) {
            return (fVarP.K() == j$.time.c.WEDNESDAY && fVarP.N()) ? 53 : 52;
        }
        return 53;
    }

    public static int M(j$.time.f fVar) {
        int iOrdinal = fVar.K().ordinal();
        int iM = fVar.M() - 1;
        int i = (3 - iOrdinal) + iM;
        int i10 = i - ((i / 7) * 7);
        int i11 = i10 - 3;
        if (i11 < -3) {
            i11 = i10 + 4;
        }
        if (iM < i11) {
            return (int) u.e(1L, O(N(fVar.Y(180).U(-1L)))).f5543d;
        }
        int i12 = ((iM - i11) / 7) + 1;
        if (i12 != 53 || i11 == -3 || (i11 == -2 && fVar.N())) {
            return i12;
        }
        return 1;
    }

    public static int N(j$.time.f fVar) {
        int i = fVar.f5434a;
        int iM = fVar.M();
        if (iM <= 3) {
            return iM - fVar.K().ordinal() < -2 ? i - 1 : i;
        }
        if (iM >= 363) {
            return ((iM - 363) - (fVar.N() ? 1 : 0)) - fVar.K().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }
}
