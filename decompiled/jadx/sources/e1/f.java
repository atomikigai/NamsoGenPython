package e1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f3203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f3204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f3206d;
    public double e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f3207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f3208g;
    public double h;
    public double i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f3209j;

    public f() {
        this.f3203a = Math.sqrt(1500.0d);
        this.f3204b = 0.5d;
        this.f3205c = false;
        this.i = Double.MAX_VALUE;
        this.f3209j = new d();
    }

    public final d a(double d10, double d11, long j4) {
        double dSin;
        double dCos;
        if (!this.f3205c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f3204b;
            if (d12 > 1.0d) {
                double d13 = this.f3203a;
                this.f3207f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f3204b;
                double d15 = this.f3203a;
                this.f3208g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.h = Math.sqrt(1.0d - (d12 * d12)) * this.f3203a;
            }
            this.f3205c = true;
        }
        double d16 = j4 / 1000.0d;
        double d17 = d10 - this.i;
        double d18 = this.f3204b;
        if (d18 > 1.0d) {
            double d19 = this.f3208g;
            double d20 = ((d19 * d17) - d11) / (d19 - this.f3207f);
            double d21 = d17 - d20;
            dSin = (Math.pow(2.718281828459045d, this.f3207f * d16) * d20) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d22 = this.f3208g;
            double dPow = Math.pow(2.718281828459045d, d22 * d16) * d21 * d22;
            double d23 = this.f3207f;
            dCos = (Math.pow(2.718281828459045d, d23 * d16) * d20 * d23) + dPow;
        } else if (d18 == 1.0d) {
            double d24 = this.f3203a;
            double d25 = (d24 * d17) + d11;
            double d26 = (d25 * d16) + d17;
            double dPow2 = Math.pow(2.718281828459045d, (-d24) * d16) * d26;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f3203a) * d16) * d26;
            double d27 = -this.f3203a;
            dCos = (Math.pow(2.718281828459045d, d27 * d16) * d25) + (dPow3 * d27);
            dSin = dPow2;
        } else {
            double d28 = 1.0d / this.h;
            double d29 = this.f3203a;
            double d30 = ((d18 * d29 * d17) + d11) * d28;
            dSin = ((Math.sin(this.h * d16) * d30) + (Math.cos(this.h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d29 * d16);
            double d31 = this.f3203a;
            double d32 = this.f3204b;
            double d33 = (-d31) * dSin * d32;
            double dPow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d16);
            double d34 = this.h;
            double dSin2 = Math.sin(d34 * d16) * (-d34) * d17;
            double d35 = this.h;
            dCos = (((Math.cos(d35 * d16) * d30 * d35) + dSin2) * dPow4) + d33;
        }
        float f10 = (float) (dSin + this.i);
        d dVar = this.f3209j;
        dVar.f3185a = f10;
        dVar.f3186b = (float) dCos;
        return dVar;
    }

    public f(float f10) {
        this.f3203a = Math.sqrt(1500.0d);
        this.f3204b = 0.5d;
        this.f3205c = false;
        this.f3209j = new d();
        this.i = f10;
    }
}
