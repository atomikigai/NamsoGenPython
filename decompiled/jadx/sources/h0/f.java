package h0;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f4550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f4551b;

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, boolean z10) {
        double d10;
        double d11;
        double radians = Math.toRadians(f16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d12 = f10;
        double d13 = f11;
        double d14 = f14;
        double d15 = ((d13 * dSin) + (d12 * dCos)) / d14;
        double d16 = f15;
        double d17 = ((d13 * dCos) + (((double) (-f10)) * dSin)) / d16;
        double d18 = f13;
        double d19 = ((d18 * dSin) + (((double) f12) * dCos)) / d14;
        double d20 = ((d18 * dCos) + (((double) (-f12)) * dSin)) / d16;
        double d21 = d15 - d19;
        double d22 = d17 - d20;
        double d23 = (d15 + d19) / 2.0d;
        double d24 = (d17 + d20) / 2.0d;
        double d25 = (d22 * d22) + (d21 * d21);
        if (d25 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d26 = (1.0d / d25) - 0.25d;
        if (d26 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d25);
            float fSqrt = (float) (Math.sqrt(d25) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z4, z10);
            return;
        }
        double dSqrt = Math.sqrt(d26);
        double d27 = dSqrt * d21;
        double d28 = dSqrt * d22;
        if (z4 == z10) {
            d10 = d23 - d28;
            d11 = d24 + d27;
        } else {
            d10 = d23 + d28;
            d11 = d24 - d27;
        }
        double dAtan2 = Math.atan2(d17 - d11, d15 - d10);
        double dAtan3 = Math.atan2(d20 - d11, d19 - d10) - dAtan2;
        if (z10 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d29 = d10 * d14;
        double d30 = d11 * d16;
        double d31 = (d29 * dCos) - (d30 * dSin);
        double d32 = (d30 * dCos) + (d29 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d33 = -d14;
        double d34 = d33 * dCos2;
        double d35 = d16 * dSin2;
        double d36 = (d34 * dSin3) - (d35 * dCos3);
        double d37 = d33 * dSin2;
        double d38 = d16 * dCos2;
        double d39 = dAtan3 / ((double) iCeil);
        double d40 = (dCos3 * d38) + (dSin3 * d37);
        double d41 = d12;
        double d42 = d13;
        int i = 0;
        double d43 = dAtan2;
        while (i < iCeil) {
            double d44 = d43 + d39;
            double dSin4 = Math.sin(d44);
            double dCos4 = Math.cos(d44);
            int i10 = iCeil;
            double d45 = (((d14 * dCos2) * dCos4) + d31) - (d35 * dSin4);
            double d46 = (d38 * dSin4) + (d14 * dSin2 * dCos4) + d32;
            double d47 = (d34 * dSin4) - (d35 * dCos4);
            double d48 = (dCos4 * d38) + (dSin4 * d37);
            double d49 = d44 - d43;
            double dTan = Math.tan(d49 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d36 * dSqrt2) + d41), (float) ((d40 * dSqrt2) + d42), (float) (d45 - (dSqrt2 * d47)), (float) (d46 - (dSqrt2 * d48)), (float) d45, (float) d46);
            i++;
            d42 = d46;
            dCos2 = dCos2;
            d37 = d37;
            d43 = d44;
            d40 = d48;
            d41 = d45;
            iCeil = i10;
            d36 = d47;
            d39 = d39;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(f[] fVarArr, Path path) {
        int i;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        int i12 = 6;
        float[] fArr = new float[6];
        int i13 = 0;
        char c10 = 'm';
        int i14 = 0;
        while (i14 < fVarArr.length) {
            f fVar = fVarArr[i14];
            char c11 = fVar.f4550a;
            float[] fArr2 = fVar.f4551b;
            float f21 = fArr[i13];
            float f22 = fArr[1];
            float f23 = fArr[2];
            float f24 = fArr[3];
            float f25 = fArr[4];
            float f26 = fArr[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i12;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f25, f26);
                    f21 = f25;
                    f23 = f21;
                    f22 = f26;
                    f24 = f22;
                default:
                    i = 2;
                    break;
            }
            float f27 = f22;
            float f28 = f25;
            float f29 = f26;
            float f30 = f21;
            int i15 = i13;
            while (i15 < fArr2.length) {
                if (c11 == 'A') {
                    i10 = i15;
                    fArr2 = fArr2;
                    i11 = i13;
                    float f31 = f27;
                    c11 = c11;
                    int i16 = i10 + 5;
                    int i17 = i10 + 6;
                    a(path, f30, f31, fArr2[i16], fArr2[i17], fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f ? 1 : i11, fArr2[i10 + 4] != 0.0f ? 1 : i11);
                    f23 = fArr2[i16];
                    f30 = f23;
                    f10 = fArr2[i17];
                    f24 = f10;
                } else if (c11 == 'C') {
                    i10 = i15;
                    c11 = c11;
                    fArr2 = fArr2;
                    i11 = i13;
                    int i18 = i10 + 2;
                    int i19 = i10 + 3;
                    int i20 = i10 + 4;
                    int i21 = i10 + 5;
                    path.cubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i18], fArr2[i19], fArr2[i20], fArr2[i21]);
                    float f32 = fArr2[i20];
                    float f33 = fArr2[i21];
                    f30 = f32;
                    f23 = fArr2[i18];
                    f24 = fArr2[i19];
                    f10 = f33;
                } else if (c11 != 'H') {
                    if (c11 != 'Q') {
                        i11 = i13;
                        if (c11 == 'V') {
                            i10 = i15;
                            c11 = c11;
                            fArr2 = fArr2;
                            path.lineTo(f30, fArr2[i10]);
                            f10 = fArr2[i10];
                        } else if (c11 != 'a') {
                            if (c11 == 'c') {
                                i10 = i15;
                                int i22 = i10 + 2;
                                int i23 = i10 + 3;
                                int i24 = i10 + 4;
                                int i25 = i10 + 5;
                                path.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i22], fArr2[i23], fArr2[i24], fArr2[i25]);
                                float f34 = fArr2[i22] + f30;
                                float f35 = f27 + fArr2[i23];
                                f30 += fArr2[i24];
                                f27 += fArr2[i25];
                                f23 = f34;
                                f24 = f35;
                            } else if (c11 != 'h') {
                                if (c11 != 'q') {
                                    if (c11 != 'v') {
                                        if (c11 == 'L') {
                                            i10 = i15;
                                            int i26 = i10 + 1;
                                            path.lineTo(fArr2[i10], fArr2[i26]);
                                            f16 = fArr2[i10];
                                            f10 = fArr2[i26];
                                        } else if (c11 == 'M') {
                                            i10 = i15;
                                            f16 = fArr2[i10];
                                            f10 = fArr2[i10 + 1];
                                            if (i10 > 0) {
                                                path.lineTo(f16, f10);
                                            } else {
                                                path.moveTo(f16, f10);
                                                f30 = f16;
                                                f28 = f30;
                                                f29 = f10;
                                            }
                                            c11 = c11;
                                            fArr2 = fArr2;
                                        } else if (c11 == 'S') {
                                            i10 = i15;
                                            if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                f30 = (f30 * 2.0f) - f23;
                                                f27 = (f27 * 2.0f) - f24;
                                            }
                                            float f36 = f30;
                                            int i27 = i10 + 1;
                                            int i28 = i10 + 2;
                                            int i29 = i10 + 3;
                                            path.cubicTo(f36, f27, fArr2[i10], fArr2[i27], fArr2[i28], fArr2[i29]);
                                            f11 = fArr2[i10];
                                            f24 = fArr2[i27];
                                            f30 = fArr2[i28];
                                            f10 = fArr2[i29];
                                            fArr2 = fArr2;
                                        } else if (c11 != 'T') {
                                            if (c11 == 'l') {
                                                i10 = i15;
                                                int i30 = i10 + 1;
                                                path.rLineTo(fArr2[i10], fArr2[i30]);
                                                f30 += fArr2[i10];
                                                f15 = fArr2[i30];
                                            } else if (c11 == 'm') {
                                                i10 = i15;
                                                float f37 = fArr2[i10];
                                                f30 += f37;
                                                float f38 = fArr2[i10 + 1];
                                                f27 += f38;
                                                if (i10 > 0) {
                                                    path.rLineTo(f37, f38);
                                                } else {
                                                    path.rMoveTo(f37, f38);
                                                    f28 = f30;
                                                    f10 = f27;
                                                    f29 = f10;
                                                }
                                            } else if (c11 == 's') {
                                                if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                    f17 = f27 - f24;
                                                    f18 = f30 - f23;
                                                } else {
                                                    f18 = 0.0f;
                                                    f17 = 0.0f;
                                                }
                                                int i31 = i15 + 1;
                                                int i32 = i15 + 2;
                                                int i33 = i15 + 3;
                                                i10 = i15;
                                                path.rCubicTo(f18, f17, fArr2[i15], fArr2[i31], fArr2[i32], fArr2[i33]);
                                                f12 = fArr2[i10] + f30;
                                                f13 = f27 + fArr2[i31];
                                                f30 += fArr2[i32];
                                                f14 = fArr2[i33];
                                            } else if (c11 != 't') {
                                                i10 = i15;
                                            } else {
                                                if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                    f19 = f30 - f23;
                                                    f20 = f27 - f24;
                                                } else {
                                                    f20 = 0.0f;
                                                    f19 = 0.0f;
                                                }
                                                int i34 = i15 + 1;
                                                path.rQuadTo(f19, f20, fArr2[i15], fArr2[i34]);
                                                float f39 = f19 + f30;
                                                float f40 = f27 + f20;
                                                f30 += fArr2[i15];
                                                f27 += fArr2[i34];
                                                f24 = f40;
                                                i10 = i15;
                                                f23 = f39;
                                            }
                                            c11 = c11;
                                        } else {
                                            i10 = i15;
                                            if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                f30 = (f30 * 2.0f) - f23;
                                                f27 = (f27 * 2.0f) - f24;
                                            }
                                            float f41 = f27;
                                            int i35 = i10 + 1;
                                            path.quadTo(f30, f41, fArr2[i10], fArr2[i35]);
                                            f24 = f41;
                                            c11 = c11;
                                            fArr2 = fArr2;
                                            f23 = f30;
                                            f30 = fArr2[i10];
                                            f10 = fArr2[i35];
                                        }
                                        f30 = f16;
                                        c11 = c11;
                                        fArr2 = fArr2;
                                    } else {
                                        i10 = i15;
                                        path.rLineTo(0.0f, fArr2[i10]);
                                        f15 = fArr2[i10];
                                    }
                                    f27 += f15;
                                } else {
                                    i10 = i15;
                                    int i36 = i10 + 1;
                                    int i37 = i10 + 2;
                                    int i38 = i10 + 3;
                                    path.rQuadTo(fArr2[i10], fArr2[i36], fArr2[i37], fArr2[i38]);
                                    f12 = fArr2[i10] + f30;
                                    f13 = f27 + fArr2[i36];
                                    f30 += fArr2[i37];
                                    f14 = fArr2[i38];
                                }
                                f27 += f14;
                                f23 = f12;
                                f24 = f13;
                            } else {
                                i10 = i15;
                                path.rLineTo(fArr2[i10], 0.0f);
                                f30 += fArr2[i10];
                            }
                            f10 = f27;
                            c11 = c11;
                        } else {
                            i10 = i15;
                            int i39 = i10 + 5;
                            float f42 = fArr2[i39] + f30;
                            int i40 = i10 + 6;
                            float f43 = fArr2[i40] + f27;
                            fArr2 = fArr2;
                            float f44 = f30;
                            float f45 = f27;
                            c11 = c11;
                            a(path, f44, f45, f42, f43, fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f ? 1 : i11, fArr2[i10 + 4] != 0.0f ? 1 : i11);
                            f30 = f44 + fArr2[i39];
                            f10 = fArr2[i40] + f45;
                            f24 = f10;
                            f23 = f30;
                        }
                    } else {
                        i10 = i15;
                        fArr2 = fArr2;
                        i11 = i13;
                        int i41 = i10 + 1;
                        int i42 = i10 + 2;
                        int i43 = i10 + 3;
                        path.quadTo(fArr2[i10], fArr2[i41], fArr2[i42], fArr2[i43]);
                        f11 = fArr2[i10];
                        f24 = fArr2[i41];
                        f30 = fArr2[i42];
                        f10 = fArr2[i43];
                    }
                    f23 = f11;
                } else {
                    i10 = i15;
                    fArr2 = fArr2;
                    i11 = i13;
                    f10 = f27;
                    c11 = c11;
                    path.lineTo(fArr2[i10], f10);
                    f30 = fArr2[i10];
                }
                c10 = c11;
                c11 = c10;
                i13 = i11;
                fArr2 = fArr2;
                f27 = f10;
                i15 = i10 + i;
                path = path;
            }
            fArr[i13] = f30;
            fArr[1] = f27;
            fArr[2] = f23;
            fArr[3] = f24;
            fArr[4] = f28;
            fArr[5] = f29;
            c10 = fVarArr[i14].f4550a;
            i14++;
            i12 = 6;
        }
    }
}
