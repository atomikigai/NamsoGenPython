package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzanv implements zzann {
    final /* synthetic */ zzanw zza;
    private final zzec zzb = new zzec(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzanv(zzanw zzanwVar, int i) {
        this.zza = zzanwVar;
        this.zze = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fb  */
    @Override // com.google.android.gms.internal.ads.zzann
    public final void zza(zzed zzedVar) {
        int i;
        int i10;
        if (zzedVar.zzm() != 2) {
            return;
        }
        zzek zzekVar = (zzek) this.zza.zzb.get(0);
        if ((zzedVar.zzm() & 128) != 0) {
            zzedVar.zzM(1);
            int iZzq = zzedVar.zzq();
            int i11 = 3;
            zzedVar.zzM(3);
            zzedVar.zzG(this.zzb, 2);
            this.zzb.zzn(3);
            int i12 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzedVar.zzG(this.zzb, 2);
            int i13 = 4;
            this.zzb.zzn(4);
            int i14 = 12;
            zzedVar.zzM(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int iZzb = zzedVar.zzb();
            while (iZzb > 0) {
                int i15 = 5;
                zzedVar.zzG(this.zzb, 5);
                zzec zzecVar = this.zzb;
                int iZzd = zzecVar.zzd(8);
                zzecVar.zzn(i11);
                int iZzd2 = this.zzb.zzd(i12);
                this.zzb.zzn(i13);
                int iZzd3 = this.zzb.zzd(i14);
                int iZzd4 = zzedVar.zzd();
                int i16 = iZzd4 + iZzd3;
                int iZzm = 0;
                String str = null;
                ArrayList arrayList = null;
                int i17 = -1;
                while (zzedVar.zzd() < i16) {
                    int iZzm2 = zzedVar.zzm();
                    int iZzd5 = zzedVar.zzd() + zzedVar.zzm();
                    if (iZzd5 > i16) {
                        break;
                    }
                    if (iZzm2 == i15) {
                        long jZzu = zzedVar.zzu();
                        if (jZzu == 1094921523) {
                            i = iZzb;
                            i17 = 129;
                        } else if (jZzu == 1161904947) {
                            i = iZzb;
                            i17 = 135;
                        } else if (jZzu == 1094921524) {
                            i = iZzb;
                            i17 = 172;
                        } else if (jZzu == 1212503619) {
                            i10 = 36;
                            i = iZzb;
                            i17 = i10;
                        } else {
                            i = iZzb;
                        }
                    } else if (iZzm2 == 106) {
                        i = iZzb;
                        i17 = 129;
                    } else if (iZzm2 == 122) {
                        i = iZzb;
                        i17 = 135;
                    } else {
                        if (iZzm2 == 127) {
                            int iZzm3 = zzedVar.zzm();
                            if (iZzm3 == 21) {
                                i = iZzb;
                                i17 = 172;
                            } else if (iZzm3 == 14) {
                                i10 = 136;
                            } else if (iZzm3 == 33) {
                                i10 = 139;
                            } else {
                                i = iZzb;
                            }
                        } else if (iZzm2 == 123) {
                            i10 = 138;
                        } else if (iZzm2 == 10) {
                            String strTrim = zzedVar.zzB(i11, StandardCharsets.UTF_8).trim();
                            iZzm = zzedVar.zzm();
                            i = iZzb;
                            str = strTrim;
                        } else if (iZzm2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzedVar.zzd() < iZzd5) {
                                String strTrim2 = zzedVar.zzB(i11, StandardCharsets.UTF_8).trim();
                                int iZzm4 = zzedVar.zzm();
                                int i18 = iZzb;
                                byte[] bArr = new byte[i13];
                                zzedVar.zzH(bArr, 0, i13);
                                arrayList2.add(new zzanx(strTrim2, iZzm4, bArr));
                                iZzb = i18;
                                i11 = 3;
                                i13 = 4;
                            }
                            i = iZzb;
                            arrayList = arrayList2;
                            i17 = 89;
                        } else {
                            i = iZzb;
                            if (iZzm2 == 111) {
                                i17 = 257;
                            }
                        }
                        i = iZzb;
                        i17 = i10;
                    }
                    zzedVar.zzM(iZzd5 - zzedVar.zzd());
                    iZzb = i;
                    i11 = 3;
                    i13 = 4;
                    i15 = 5;
                }
                int i19 = iZzb;
                zzedVar.zzL(i16);
                zzany zzanyVar = new zzany(i17, str, iZzm, arrayList, Arrays.copyOfRange(zzedVar.zzN(), iZzd4, i16));
                if (iZzd == 6 || iZzd == 5) {
                    iZzd = zzanyVar.zza;
                }
                int i20 = i19 - (iZzd3 + 5);
                if (!this.zza.zzh.get(iZzd2)) {
                    zzaob zzaobVarZzb = this.zza.zze.zzb(iZzd, zzanyVar);
                    this.zzd.put(iZzd2, iZzd2);
                    this.zzc.put(iZzd2, zzaobVarZzb);
                }
                iZzb = i20;
                i11 = 3;
                i13 = 4;
                i14 = 12;
                i12 = 13;
            }
            int size = this.zzd.size();
            for (int i21 = 0; i21 < size; i21++) {
                SparseIntArray sparseIntArray = this.zzd;
                zzanw zzanwVar = this.zza;
                int iKeyAt = sparseIntArray.keyAt(i21);
                int iValueAt = sparseIntArray.valueAt(i21);
                zzanwVar.zzh.put(iKeyAt, true);
                this.zza.zzi.put(iValueAt, true);
                zzaob zzaobVar = (zzaob) this.zzc.valueAt(i21);
                if (zzaobVar != null) {
                    zzaobVar.zzb(zzekVar, this.zza.zzl, new zzaoa(iZzq, iKeyAt, 8192));
                    this.zza.zzg.put(iValueAt, zzaobVar);
                }
            }
            this.zza.zzg.remove(this.zze);
            this.zza.zzm = 0;
            zzanw zzanwVar2 = this.zza;
            if (zzanwVar2.zzm == 0) {
                zzanwVar2.zzl.zzD();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzb(zzek zzekVar, zzacu zzacuVar, zzaoa zzaoaVar) {
    }
}
