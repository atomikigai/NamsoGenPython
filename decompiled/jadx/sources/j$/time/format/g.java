package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5448g;

    public g(j$.time.temporal.q qVar, int i, int i10, boolean z4, int i11) {
        super(qVar, i, i10, u.NOT_NEGATIVE, i11);
        this.f5448g = z4;
    }

    @Override // j$.time.format.i
    public final i a() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.f5451a, this.f5452b, this.f5453c, this.f5448g, -1);
    }

    @Override // j$.time.format.i
    public final i b(int i) {
        return new g(this.f5451a, this.f5452b, this.f5453c, this.f5448g, this.e + i);
    }

    @Override // j$.time.format.i, j$.time.format.f
    public final boolean u(p pVar, StringBuilder sb2) {
        j$.time.temporal.q qVar = this.f5451a;
        Long lA = pVar.a(qVar);
        if (lA == null) {
            return false;
        }
        s sVar = pVar.f5475b.f5439c;
        long jLongValue = lA.longValue();
        j$.time.temporal.u uVarC = qVar.C();
        uVarC.b(jLongValue, qVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(uVarC.f5540a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(uVarC.f5543d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z4 = this.f5448g;
        int i = this.f5452b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.f5453c), roundingMode).toPlainString().substring(2);
            sVar.getClass();
            if (z4) {
                sb2.append('.');
            }
            sb2.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z4) {
                sVar.getClass();
                sb2.append('.');
            }
            for (int i10 = 0; i10 < i; i10++) {
                sVar.getClass();
                sb2.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f5451a + "," + this.f5452b + "," + this.f5453c + (this.f5448g ? ",DecimalPoint" : "") + ")";
    }
}
