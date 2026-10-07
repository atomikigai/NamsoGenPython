package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.webkit.TracingConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaku implements zzaki {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzakn zzg;
    private final zzakm zzh;
    private final zzakt zzi;
    private Bitmap zzj;

    public zzaku(List list) {
        zzed zzedVar = new zzed((byte[]) list.get(0));
        int iZzq = zzedVar.zzq();
        int iZzq2 = zzedVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzakn(719, 575, 0, 719, 0, 575);
        this.zzh = new zzakm(0, zzg(), zzh(), zzi());
        this.zzi = new zzakt(iZzq, iZzq2);
    }

    private static int zzb(int i, int i10, int i11, int i12) {
        return (i << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    private static zzakm zzc(zzec zzecVar, int i) {
        int[] iArr;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i10 = 8;
        int iZzd5 = zzecVar.zzd(8);
        zzecVar.zzn(8);
        int[] iArrZzg = zzg();
        int[] iArrZzh = zzh();
        int[] iArrZzi = zzi();
        int i11 = i - 2;
        while (i11 > 0) {
            int iZzd6 = zzecVar.zzd(i10);
            int iZzd7 = zzecVar.zzd(i10);
            if ((iZzd7 & 128) != 0) {
                iArr = iArrZzg;
            } else {
                iArr = (iZzd7 & 64) != 0 ? iArrZzh : iArrZzi;
            }
            if ((iZzd7 & 1) != 0) {
                iZzd3 = zzecVar.zzd(i10);
                iZzd4 = zzecVar.zzd(i10);
                iZzd = zzecVar.zzd(i10);
                iZzd2 = zzecVar.zzd(i10);
                i11 -= 6;
            } else {
                int iZzd8 = zzecVar.zzd(6) << 2;
                int iZzd9 = zzecVar.zzd(4) << 4;
                i11 -= 4;
                iZzd = zzecVar.zzd(4) << 4;
                iZzd2 = zzecVar.zzd(2) << 6;
                iZzd3 = iZzd8;
                iZzd4 = iZzd9;
            }
            if (iZzd3 == 0) {
                iZzd2 = 255;
            }
            if (iZzd3 == 0) {
                iZzd = 0;
            }
            if (iZzd3 == 0) {
                iZzd4 = 0;
            }
            double d10 = iZzd3;
            double d11 = iZzd4 - 128;
            double d12 = iZzd - 128;
            iArr[iZzd6] = zzb((byte) (255 - (iZzd2 & 255)), Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255)));
            iZzd5 = iZzd5;
            i10 = 8;
        }
        return new zzakm(iZzd5, iArrZzg, iArrZzh, iArrZzi);
    }

    private static zzako zzd(zzec zzecVar) {
        byte[] bArr;
        int iZzd = zzecVar.zzd(16);
        zzecVar.zzn(4);
        int iZzd2 = zzecVar.zzd(2);
        boolean zZzp = zzecVar.zzp();
        zzecVar.zzn(1);
        byte[] bArr2 = zzen.zzf;
        if (iZzd2 != 1) {
            if (iZzd2 == 0) {
                int iZzd3 = zzecVar.zzd(16);
                int iZzd4 = zzecVar.zzd(16);
                if (iZzd3 > 0) {
                    bArr2 = new byte[iZzd3];
                    zzecVar.zzi(bArr2, 0, iZzd3);
                }
                if (iZzd4 > 0) {
                    bArr = new byte[iZzd4];
                    zzecVar.zzi(bArr, 0, iZzd4);
                }
            }
            return new zzako(iZzd, zZzp, bArr2, bArr);
        }
        zzecVar.zzn(zzecVar.zzd(8) * 16);
        bArr = bArr2;
        return new zzako(iZzd, zZzp, bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    private static void zze(byte[] bArr, int[] iArr, int i, int i10, int i11, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c10;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int i12;
        int iZzd4;
        int iZzd5;
        int i13;
        int i14;
        int iZzd6;
        int i15;
        Paint paint2 = paint;
        zzec zzecVar = new zzec(bArr, bArr.length);
        int i16 = i10;
        int i17 = i11;
        byte[] bArrZzf = null;
        byte[] bArrZzf2 = null;
        byte[] bArrZzf3 = null;
        while (zzecVar.zza() != 0) {
            int iZzd7 = zzecVar.zzd(8);
            if (iZzd7 != 240) {
                int i18 = 4;
                int i19 = 1;
                int i20 = 2;
                switch (iZzd7) {
                    case 16:
                        int i21 = 1;
                        if (i == 3) {
                            if (bArrZzf == null) {
                                bArr3 = zzb;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrZzf;
                            }
                        } else if (i != 2) {
                            bArr2 = null;
                        } else if (bArrZzf3 == null) {
                            bArr3 = zza;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrZzf3;
                        }
                        int i22 = 0;
                        while (true) {
                            int iZzd8 = zzecVar.zzd(2);
                            if (iZzd8 != 0) {
                                iZzd2 = i21;
                                iZzd = iZzd8;
                            } else {
                                if (zzecVar.zzp()) {
                                    iZzd3 = zzecVar.zzd(3) + 3;
                                    iZzd = zzecVar.zzd(2);
                                } else {
                                    if (zzecVar.zzp()) {
                                        iZzd2 = i21;
                                        iZzd = 0;
                                    } else {
                                        int iZzd9 = zzecVar.zzd(2);
                                        if (iZzd9 == 0) {
                                            c10 = 4;
                                            i22 = i21;
                                            iZzd = 0;
                                            iZzd2 = 0;
                                        } else if (iZzd9 == i21) {
                                            c10 = 4;
                                            i22 = i22;
                                            iZzd2 = 2;
                                            iZzd = 0;
                                        } else if (iZzd9 == 2) {
                                            c10 = 4;
                                            i22 = i22;
                                            iZzd2 = zzecVar.zzd(4) + 12;
                                            iZzd = zzecVar.zzd(2);
                                        } else if (iZzd9 != 3) {
                                            iZzd = 0;
                                            iZzd2 = 0;
                                        } else {
                                            iZzd3 = zzecVar.zzd(8) + 29;
                                            iZzd = zzecVar.zzd(2);
                                        }
                                        if (iZzd2 == 0 && paint2 != null) {
                                            int i23 = i17 + 1;
                                            float f10 = i17;
                                            if (bArr2 != 0) {
                                                iZzd = bArr2[iZzd];
                                            }
                                            paint2.setColor(iArr[iZzd]);
                                            canvas.drawRect(i16, f10, i16 + iZzd2, i23, paint2);
                                        }
                                        i16 += iZzd2;
                                        if (i22 != 0) {
                                            zzecVar.zzf();
                                        } else {
                                            paint2 = paint;
                                            i22 = i22;
                                            i21 = 1;
                                        }
                                    }
                                    c10 = 4;
                                    if (iZzd2 == 0) {
                                    }
                                    i16 += iZzd2;
                                    if (i22 != 0) {
                                        zzecVar.zzf();
                                    } else {
                                        paint2 = paint;
                                        i22 = i22;
                                        i21 = 1;
                                    }
                                }
                                iZzd2 = iZzd3;
                            }
                            c10 = 4;
                            if (iZzd2 == 0) {
                            }
                            i16 += iZzd2;
                            if (i22 != 0) {
                                zzecVar.zzf();
                            } else {
                                paint2 = paint;
                                i22 = i22;
                                i21 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrZzf2 == null ? zzc : bArrZzf2 : null;
                        boolean z4 = false;
                        while (true) {
                            int iZzd10 = zzecVar.zzd(i18);
                            if (iZzd10 != 0) {
                                i12 = 1;
                                z4 = z4;
                            } else if (zzecVar.zzp()) {
                                if (zzecVar.zzp()) {
                                    int iZzd11 = zzecVar.zzd(i20);
                                    if (iZzd11 == 0) {
                                        i12 = 1;
                                    } else if (iZzd11 == 1) {
                                        i12 = i20;
                                    } else if (iZzd11 == i20) {
                                        iZzd4 = zzecVar.zzd(i18) + 9;
                                        iZzd5 = zzecVar.zzd(i18);
                                    } else if (iZzd11 != 3) {
                                        z4 = z4;
                                        iZzd10 = 0;
                                        i12 = 0;
                                    } else {
                                        iZzd4 = zzecVar.zzd(8) + 25;
                                        iZzd5 = zzecVar.zzd(i18);
                                    }
                                    iZzd10 = 0;
                                } else {
                                    iZzd4 = zzecVar.zzd(i20) + i18;
                                    iZzd5 = zzecVar.zzd(i18);
                                }
                                i12 = iZzd4;
                                z4 = z4;
                                iZzd10 = iZzd5;
                            } else {
                                int iZzd12 = zzecVar.zzd(3);
                                if (iZzd12 != 0) {
                                    i12 = iZzd12 + 2;
                                    iZzd10 = 0;
                                } else {
                                    z4 = true;
                                    iZzd10 = 0;
                                    i12 = 0;
                                }
                            }
                            if (i12 == 0 || paint2 == null) {
                                i13 = i20;
                            } else {
                                int i24 = i17 + 1;
                                float f11 = i17;
                                if (bArr4 != 0) {
                                    iZzd10 = bArr4[iZzd10];
                                }
                                paint2.setColor(iArr[iZzd10]);
                                i13 = 2;
                                canvas.drawRect(i16, f11, i16 + i12, i24, paint2);
                            }
                            i16 += i12;
                            if (z4) {
                                zzecVar.zzf();
                                continue;
                            } else {
                                i20 = i13;
                                z4 = z4;
                                i18 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i25 = i16;
                        int i26 = 0;
                        while (true) {
                            int iZzd13 = zzecVar.zzd(8);
                            if (iZzd13 != 0) {
                                i14 = i26;
                                iZzd6 = i19;
                            } else if (zzecVar.zzp()) {
                                i14 = i26;
                                iZzd6 = zzecVar.zzd(7);
                                iZzd13 = zzecVar.zzd(8);
                            } else {
                                int iZzd14 = zzecVar.zzd(7);
                                if (iZzd14 != 0) {
                                    i14 = i26;
                                    iZzd6 = iZzd14;
                                    iZzd13 = 0;
                                } else {
                                    i14 = i19;
                                    iZzd13 = 0;
                                    iZzd6 = 0;
                                }
                            }
                            if (iZzd6 == 0 || paint2 == null) {
                                i15 = i19;
                            } else {
                                paint2.setColor(iArr[iZzd13]);
                                i15 = i19;
                                canvas.drawRect(i25, i17, i25 + iZzd6, i17 + 1, paint2);
                            }
                            i25 += iZzd6;
                            if (i14 != 0) {
                                i16 = i25;
                                continue;
                            } else {
                                i19 = i15;
                                i26 = i14;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iZzd7) {
                            case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                                bArrZzf3 = zzf(4, 4, zzecVar);
                                break;
                            case 33:
                                bArrZzf = zzf(4, 8, zzecVar);
                                break;
                            case 34:
                                bArrZzf2 = zzf(16, 8, zzecVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i17 += 2;
                i16 = i10;
            }
            paint2 = paint;
        }
    }

    private static byte[] zzf(int i, int i10, zzec zzecVar) {
        byte[] bArr = new byte[i];
        for (int i11 = 0; i11 < i; i11++) {
            bArr[i11] = (byte) zzecVar.zzd(i10);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i10 = i & 4;
            int i11 = i & 2;
            int i12 = i & 1;
            if (i < 8) {
                iArr[i] = zzb(255, 1 != i12 ? 0 : 255, i11 != 0 ? 255 : 0, i10 != 0 ? 255 : 0);
            } else {
                iArr[i] = zzb(255, 1 != i12 ? 0 : 127, i11 != 0 ? 127 : 0, i10 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzb(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i10 = i & 136;
                if (i10 == 0) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i10 == 8) {
                    iArr[i] = zzb(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i10 == 128) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i10 == 136) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i, int i10, zzakh zzakhVar, zzdg zzdgVar) {
        boolean z4;
        zzaka zzakaVar;
        float f10;
        float f11;
        char c10;
        int i11;
        zzakr zzakrVar;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i12;
        int iZzd5;
        zzec zzecVar = new zzec(bArr, i + i10);
        zzecVar.zzl(i);
        while (true) {
            z4 = true;
            if (zzecVar.zza() >= 48 && zzecVar.zzd(8) == 15) {
                zzakt zzaktVar = this.zzi;
                int iZzd6 = zzecVar.zzd(8);
                int iZzd7 = zzecVar.zzd(16);
                int iZzd8 = zzecVar.zzd(16);
                int iZzb = zzecVar.zzb() + iZzd8;
                if (iZzd8 * 8 > zzecVar.zza()) {
                    zzdt.zzf("DvbParser", "Data field length exceeds limit");
                    zzecVar.zzn(zzecVar.zza());
                } else {
                    switch (iZzd6) {
                        case 16:
                            if (iZzd7 == zzaktVar.zza) {
                                zzakp zzakpVar = zzaktVar.zzi;
                                int iZzd9 = zzecVar.zzd(8);
                                int iZzd10 = zzecVar.zzd(4);
                                int iZzd11 = zzecVar.zzd(2);
                                zzecVar.zzn(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i13 = iZzd8 - 2; i13 > 0; i13 -= 6) {
                                    int iZzd12 = zzecVar.zzd(8);
                                    zzecVar.zzn(8);
                                    sparseArray.put(iZzd12, new zzakq(zzecVar.zzd(16), zzecVar.zzd(16)));
                                }
                                zzakp zzakpVar2 = new zzakp(iZzd9, iZzd10, iZzd11, sparseArray);
                                if (zzakpVar2.zzb != 0) {
                                    zzaktVar.zzi = zzakpVar2;
                                    zzaktVar.zzc.clear();
                                    zzaktVar.zzd.clear();
                                    zzaktVar.zze.clear();
                                } else if (zzakpVar != null) {
                                    if (zzakpVar.zza != zzakpVar2.zza) {
                                        zzaktVar.zzi = zzakpVar2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzakp zzakpVar3 = zzaktVar.zzi;
                            if (iZzd7 == zzaktVar.zza && zzakpVar3 != null) {
                                int iZzd13 = zzecVar.zzd(8);
                                zzecVar.zzn(4);
                                boolean zZzp = zzecVar.zzp();
                                zzecVar.zzn(3);
                                int iZzd14 = zzecVar.zzd(16);
                                int iZzd15 = zzecVar.zzd(16);
                                int iZzd16 = zzecVar.zzd(3);
                                int iZzd17 = zzecVar.zzd(3);
                                zzecVar.zzn(2);
                                int iZzd18 = zzecVar.zzd(8);
                                int iZzd19 = zzecVar.zzd(8);
                                int iZzd20 = zzecVar.zzd(4);
                                int iZzd21 = zzecVar.zzd(2);
                                zzecVar.zzn(2);
                                int i14 = iZzd8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i14 > 0) {
                                    int iZzd22 = zzecVar.zzd(16);
                                    int iZzd23 = zzecVar.zzd(2);
                                    int iZzd24 = zzecVar.zzd(2);
                                    int iZzd25 = zzecVar.zzd(12);
                                    zzecVar.zzn(4);
                                    int iZzd26 = zzecVar.zzd(12);
                                    int i15 = i14 - 6;
                                    if (iZzd23 == 1) {
                                        i14 -= 8;
                                        iZzd = zzecVar.zzd(8);
                                        iZzd2 = zzecVar.zzd(8);
                                    } else if (iZzd23 == 2) {
                                        iZzd23 = 2;
                                        i14 -= 8;
                                        iZzd = zzecVar.zzd(8);
                                        iZzd2 = zzecVar.zzd(8);
                                    } else {
                                        i14 = i15;
                                        iZzd = 0;
                                        iZzd2 = 0;
                                    }
                                    sparseArray2.put(iZzd22, new zzaks(iZzd23, iZzd24, iZzd25, iZzd26, iZzd, iZzd2));
                                }
                                zzakr zzakrVar2 = new zzakr(iZzd13, zZzp, iZzd14, iZzd15, iZzd16, iZzd17, iZzd18, iZzd19, iZzd20, iZzd21, sparseArray2);
                                if (zzakpVar3.zzb == 0 && (zzakrVar = (zzakr) zzaktVar.zzc.get(zzakrVar2.zza)) != null) {
                                    int i16 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzakrVar.zzj;
                                        if (i16 < sparseArray3.size()) {
                                            zzakrVar2.zzj.put(sparseArray3.keyAt(i16), (zzaks) sparseArray3.valueAt(i16));
                                            i16++;
                                        }
                                    }
                                }
                                zzaktVar.zzc.put(zzakrVar2.zza, zzakrVar2);
                            }
                            break;
                        case 18:
                            if (iZzd7 == zzaktVar.zza) {
                                zzakm zzakmVarZzc = zzc(zzecVar, iZzd8);
                                zzaktVar.zzd.put(zzakmVarZzc.zza, zzakmVarZzc);
                            } else if (iZzd7 == zzaktVar.zzb) {
                                zzakm zzakmVarZzc2 = zzc(zzecVar, iZzd8);
                                zzaktVar.zzf.put(zzakmVarZzc2.zza, zzakmVarZzc2);
                            }
                            break;
                        case 19:
                            if (iZzd7 == zzaktVar.zza) {
                                zzako zzakoVarZzd = zzd(zzecVar);
                                zzaktVar.zze.put(zzakoVarZzd.zza, zzakoVarZzd);
                            } else if (iZzd7 == zzaktVar.zzb) {
                                zzako zzakoVarZzd2 = zzd(zzecVar);
                                zzaktVar.zzg.put(zzakoVarZzd2.zza, zzakoVarZzd2);
                            }
                            break;
                        case 20:
                            if (iZzd7 == zzaktVar.zza) {
                                zzecVar.zzn(4);
                                boolean zZzp2 = zzecVar.zzp();
                                zzecVar.zzn(3);
                                int iZzd27 = zzecVar.zzd(16);
                                int iZzd28 = zzecVar.zzd(16);
                                if (zZzp2) {
                                    int iZzd29 = zzecVar.zzd(16);
                                    iZzd3 = zzecVar.zzd(16);
                                    iZzd5 = zzecVar.zzd(16);
                                    iZzd4 = zzecVar.zzd(16);
                                    i12 = iZzd29;
                                } else {
                                    iZzd3 = iZzd27;
                                    iZzd4 = iZzd28;
                                    i12 = 0;
                                    iZzd5 = 0;
                                }
                                zzaktVar.zzh = new zzakn(iZzd27, iZzd28, i12, iZzd3, iZzd5, iZzd4);
                            }
                            break;
                    }
                    zzecVar.zzo(iZzb - zzecVar.zzb());
                }
            }
        }
        zzakt zzaktVar2 = this.zzi;
        zzakp zzakpVar4 = zzaktVar2.zzi;
        if (zzakpVar4 == null) {
            zzakaVar = new zzaka(zzfzo.zzn(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzakn zzaknVar = zzaktVar2.zzh;
            if (zzaknVar == null) {
                zzaknVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzaknVar.zza + 1 != bitmap.getWidth() || zzaknVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzaknVar.zza + 1, zzaknVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzakpVar4.zzc;
            int i17 = 0;
            while (i17 < sparseArray4.size()) {
                this.zzf.save();
                zzakq zzakqVar = (zzakq) sparseArray4.valueAt(i17);
                zzakr zzakrVar3 = (zzakr) this.zzi.zzc.get(sparseArray4.keyAt(i17));
                int i18 = zzakqVar.zza + zzaknVar.zzc;
                int i19 = zzakqVar.zzb + zzaknVar.zze;
                this.zzf.clipRect(i18, i19, Math.min(zzakrVar3.zzc + i18, zzaknVar.zzd), Math.min(zzakrVar3.zzd + i19, zzaknVar.zzf));
                zzakm zzakmVar = (zzakm) this.zzi.zzd.get(zzakrVar3.zzf);
                if (zzakmVar == null) {
                    zzakmVar = (zzakm) this.zzi.zzf.get(zzakrVar3.zzf);
                    if (zzakmVar == null) {
                        zzakmVar = this.zzh;
                    }
                }
                SparseArray sparseArray5 = zzakrVar3.zzj;
                int i20 = 0;
                while (i20 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i20);
                    boolean z10 = z4;
                    zzaks zzaksVar = (zzaks) sparseArray5.valueAt(i20);
                    zzako zzakoVar = (zzako) this.zzi.zze.get(iKeyAt);
                    if (zzakoVar == null) {
                        zzakoVar = (zzako) this.zzi.zzg.get(iKeyAt);
                    }
                    if (zzakoVar != null) {
                        Paint paint = zzakoVar.zzb ? null : this.zzd;
                        int i21 = zzakrVar3.zze;
                        int i22 = i18 + zzaksVar.zza;
                        int i23 = i19 + zzaksVar.zzb;
                        Canvas canvas = this.zzf;
                        int[] iArr = i21 == 3 ? zzakmVar.zzd : i21 == 2 ? zzakmVar.zzc : zzakmVar.zzb;
                        zze(zzakoVar.zzc, iArr, i21, i22, i23, paint, canvas);
                        zze(zzakoVar.zzd, iArr, i21, i22, i23 + 1, paint, canvas);
                    }
                    i20++;
                    z4 = z10;
                }
                boolean z11 = z4;
                float f12 = i19;
                float f13 = i18;
                if (zzakrVar3.zzb) {
                    int i24 = zzakrVar3.zze;
                    if (i24 == 3) {
                        i11 = zzakmVar.zzd[zzakrVar3.zzg];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        i11 = i24 == 2 ? zzakmVar.zzc[zzakrVar3.zzh] : zzakmVar.zzb[zzakrVar3.zzi];
                    }
                    this.zze.setColor(i11);
                    f10 = f12;
                    f11 = f13;
                    this.zzf.drawRect(f11, f10, zzakrVar3.zzc + i18, zzakrVar3.zzd + i19, this.zze);
                } else {
                    f10 = f12;
                    f11 = f13;
                    c10 = 2;
                }
                zzcr zzcrVar = new zzcr();
                zzcrVar.zzc(Bitmap.createBitmap(this.zzj, i18, i19, zzakrVar3.zzc, zzakrVar3.zzd));
                zzcrVar.zzh(f11 / zzaknVar.zza);
                zzcrVar.zzi(0);
                zzcrVar.zze(f10 / zzaknVar.zzb, 0);
                zzcrVar.zzf(0);
                zzcrVar.zzk(zzakrVar3.zzc / zzaknVar.zza);
                zzcrVar.zzd(zzakrVar3.zzd / zzaknVar.zzb);
                arrayList.add(zzcrVar.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i17++;
                z4 = z11;
            }
            zzakaVar = new zzaka(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdgVar.zza(zzakaVar);
    }
}
