package com.google.android.gms.internal.ads;

import da.v;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzre extends zzcn {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzre() {
        byte[] bArr = zzen.zzf;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final int zzq(int i) {
        int iZzr = ((zzr(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzdb.zzf(iZzr >= 0);
        int iMin = (int) Math.min((i * 0.2f) + 0.5f, iZzr);
        int i10 = this.zzd;
        return (iMin / i10) * i10;
    }

    private final int zzr(long j4) {
        return (int) ((j4 * ((long) this.zzb.zzb)) / 1000000);
    }

    private static int zzs(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private final void zzt(boolean z4) {
        int i;
        int length;
        int i10 = this.zzk;
        int length2 = this.zzi.length;
        if (i10 != length2) {
            if (!z4) {
                return;
            } else {
                z4 = true;
            }
        }
        if (this.zzh == 0) {
            if (z4) {
                zzu(i10, 3);
                length = i10;
            } else {
                zzdb.zzf(i10 >= (length2 >> 1));
                length = this.zzi.length >> 1;
                zzu(length, 0);
            }
            i = length;
        } else {
            int i11 = length2 >> 1;
            int i12 = i10 - i11;
            if (z4) {
                int iZzq = zzq(i12) + (this.zzi.length >> 1);
                zzu(iZzq, 2);
                int i13 = i11 + i12;
                i = iZzq;
                length = i13;
            } else {
                int iZzq2 = zzq(i12);
                zzu(iZzq2, 1);
                i = iZzq2;
                length = i12;
            }
        }
        zzdb.zzg(length % this.zzd == 0, "bytesConsumed is not aligned to frame size: %s" + length);
        zzdb.zzf(i10 >= i);
        this.zzk -= length;
        int i14 = this.zzj + length;
        this.zzj = i14;
        this.zzj = i14 % this.zzi.length;
        int i15 = this.zzh;
        int i16 = this.zzd;
        this.zzh = (i / i16) + i15;
        this.zzg += (long) ((length - i) / i16);
    }

    private final void zzu(int i, int i10) {
        int i11;
        if (i == 0) {
            return;
        }
        zzdb.zzd(this.zzk >= i);
        if (i10 == 2) {
            int i12 = this.zzj;
            int i13 = this.zzk;
            int i14 = i12 + i13;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i14 <= length) {
                System.arraycopy(bArr, i14 - i, this.zzl, 0, i);
            } else {
                int i15 = i13 - (length - i12);
                if (i15 >= i) {
                    System.arraycopy(bArr, i15 - i, this.zzl, 0, i);
                } else {
                    int i16 = i - i15;
                    System.arraycopy(bArr, length - i16, this.zzl, 0, i16);
                    System.arraycopy(this.zzi, 0, this.zzl, i16, i15);
                }
            }
        } else {
            int i17 = this.zzj;
            int i18 = i17 + i;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i18 <= length2) {
                System.arraycopy(bArr2, i17, this.zzl, 0, i);
            } else {
                int i19 = length2 - i17;
                System.arraycopy(bArr2, i17, this.zzl, 0, i19);
                System.arraycopy(this.zzi, 0, this.zzl, i19, i - i19);
            }
        }
        zzdb.zze(i % this.zzd == 0, "sizeToOutput is not aligned to frame size: " + i);
        zzdb.zzf(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzdb.zze(i % this.zzd == 0, v.f(i, "byteOutput size is not aligned to frame size "));
        if (i10 != 3) {
            for (int i20 = 0; i20 < i; i20 += 2) {
                int i21 = i20 + 1;
                int iZzs = zzs(bArr3[i21], bArr3[i20]);
                if (i10 == 0) {
                    i11 = ((((i20 * zzbbs.zzq.zzf) / (i - 1)) * (-90)) / zzbbs.zzq.zzf) + 100;
                } else {
                    i11 = 10;
                    if (i10 == 2) {
                        i11 = 10 + (((90000 * i20) / (i - 1)) / zzbbs.zzq.zzf);
                    }
                }
                int i22 = (iZzs * i11) / 100;
                if (i22 >= 32767) {
                    bArr3[i20] = -1;
                    bArr3[i21] = 127;
                } else if (i22 <= -32768) {
                    bArr3[i20] = 0;
                    bArr3[i21] = -128;
                } else {
                    bArr3[i20] = (byte) (i22 & 255);
                    bArr3[i21] = (byte) (i22 >> 8);
                }
            }
        }
        zzj(i).put(bArr3, 0, i).flip();
    }

    private static final boolean zzv(byte b10, byte b11) {
        return Math.abs(zzs(b10, b11)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zze(ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzn()) {
            if (this.zzf != 0) {
                zzdb.zzf(this.zzj < this.zzi.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i10 = this.zzd;
                            iLimit = (iPosition2 / i10) * i10;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i11 = this.zzj;
                int i12 = this.zzk;
                int i13 = i11 + i12;
                int length = this.zzi.length;
                if (i13 < length) {
                    i = length - i13;
                } else {
                    i13 = i12 - (length - i11);
                    i = i11 - i13;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzi, i13, iMin);
                int i14 = this.zzk + iMin;
                this.zzk = i14;
                zzdb.zzf(i14 <= this.zzi.length);
                boolean z4 = iLimit < iLimit2 && iPosition3 < i;
                zzt(z4);
                if (z4) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.zzi.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i15 = this.zzd;
                            iPosition = ((iLimit4 / i15) * i15) + i15;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzcm
    public final boolean zzg() {
        return super.zzg() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzi(zzck zzckVar) throws zzcl {
        if (zzckVar.zzd == 2) {
            return zzckVar.zzb == -1 ? zzck.zza : zzckVar;
        }
        throw new zzcl("Unhandled input format:", zzckVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzk() {
        if (zzg()) {
            int i = this.zzb.zzc;
            this.zzd = i + i;
            int iZzr = zzr(100000L) / 2;
            int i10 = this.zzd;
            int i11 = (iZzr / i10) * i10;
            int i12 = i11 + i11;
            if (this.zzi.length != i12) {
                this.zzi = new byte[i12];
                this.zzl = new byte[i12];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzl() {
        if (this.zzk > 0) {
            zzt(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzm() {
        this.zze = false;
        byte[] bArr = zzen.zzf;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final long zzo() {
        return this.zzg;
    }

    public final void zzp(boolean z4) {
        this.zze = z4;
    }
}
