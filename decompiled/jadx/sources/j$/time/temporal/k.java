package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public enum k implements q {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f5528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient u f5529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient long f5530c;

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j4) {
        this.f5528a = str;
        this.f5529b = u.e((-365243219162L) + j4, 365241780471L + j4);
        this.f5530c = j4;
    }

    @Override // j$.time.temporal.q
    public final u C() {
        return this.f5529b;
    }

    @Override // j$.time.temporal.q
    public final m K(m mVar, long j4) {
        if (!this.f5529b.d(j4)) {
            throw new j$.time.a("Invalid value: " + this.f5528a + " " + j4);
        }
        return mVar.i(Math.subtractExact(j4, this.f5530c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final boolean u(n nVar) {
        return nVar.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final u w(n nVar) {
        if (nVar.f(a.EPOCH_DAY)) {
            return this.f5529b;
        }
        throw new j$.time.a("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.q
    public final long I(n nVar) {
        return nVar.g(a.EPOCH_DAY) + this.f5530c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5528a;
    }
}
