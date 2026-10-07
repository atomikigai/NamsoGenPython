package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum i implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5523a;

    static {
        Duration.ofSeconds(31556952L);
        Duration.ofSeconds(7889238L);
    }

    i(String str) {
        this.f5523a = str;
    }

    @Override // j$.time.temporal.s
    public final m u(m mVar, long j4) {
        int i = c.f5519a[ordinal()];
        if (i == 1) {
            h hVar = j.f5526c;
            return mVar.i(Math.addExact(mVar.e(hVar), j4), hVar);
        }
        if (i == 2) {
            return mVar.l(j4 / 4, b.YEARS).l((j4 % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5523a;
    }
}
