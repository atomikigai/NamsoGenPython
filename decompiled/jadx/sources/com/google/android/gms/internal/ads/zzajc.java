package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajc {
    private static final zzfxd zza = zzfxd.zzb(zzfwf.zzc(':'));
    private static final zzfxd zzb = zzfxd.zzb(zzfwf.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x011b A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int zza(zzacs zzacsVar, zzadn zzadnVar, List list) throws IOException {
        char c10;
        int i;
        ArrayList arrayList;
        List listZze;
        int i10;
        List listZze2;
        int i11 = this.zzd;
        if (i11 == 0) {
            long jZzd = zzacsVar.zzd();
            zzadnVar.zza = (jZzd == -1 || jZzd < 8) ? 0L : jZzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i12 = 8;
        if (i11 != 1) {
            short s10 = 2820;
            short s11 = 2819;
            short s12 = 2817;
            short s13 = 2816;
            short s14 = 2192;
            if (i11 != 2) {
                long jZzf = zzacsVar.zzf();
                int iZzd = (int) ((zzacsVar.zzd() - zzacsVar.zzf()) - ((long) this.zze));
                zzed zzedVar = new zzed(iZzd);
                zzacsVar.zzi(zzedVar.zzN(), 0, iZzd);
                for (int i13 = 0; i13 < this.zzc.size(); i13++) {
                    zzajb zzajbVar = (zzajb) this.zzc.get(i13);
                    zzedVar.zzL((int) (zzajbVar.zza - jZzf));
                    zzedVar.zzM(4);
                    int iZzi = zzedVar.zzi();
                    Charset charset = StandardCharsets.UTF_8;
                    String strZzB = zzedVar.zzB(iZzi, charset);
                    switch (strZzB.hashCode()) {
                        case -1711564334:
                            if (!strZzB.equals("SlowMotion_Data")) {
                                throw zzbh.zza("Invalid SEF name", null);
                            }
                            c10 = 2192;
                            i = zzajbVar.zzb - (iZzi + 8);
                            if (c10 == 2192) {
                                arrayList = new ArrayList();
                                listZze = zzb.zze(zzedVar.zzB(i, charset));
                                for (i10 = 0; i10 < listZze.size(); i10++) {
                                    listZze2 = zza.zze((CharSequence) listZze.get(i10));
                                    if (listZze2.size() != 3) {
                                        throw zzbh.zza(null, null);
                                    }
                                    try {
                                        arrayList.add(new zzahc(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                                    } catch (NumberFormatException e) {
                                        throw zzbh.zza(null, e);
                                    }
                                }
                                list.add(new zzahd(arrayList));
                            } else if (c10 == 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                                throw new IllegalStateException();
                            }
                            break;
                            break;
                        case -1332107749:
                            if (!strZzB.equals("Super_SlowMotion_Edit_Data")) {
                                throw zzbh.zza("Invalid SEF name", null);
                            }
                            c10 = 2819;
                            i = zzajbVar.zzb - (iZzi + 8);
                            if (c10 == 2192) {
                                arrayList = new ArrayList();
                                listZze = zzb.zze(zzedVar.zzB(i, charset));
                                while (i10 < listZze.size()) {
                                    listZze2 = zza.zze((CharSequence) listZze.get(i10));
                                    if (listZze2.size() != 3) {
                                        throw zzbh.zza(null, null);
                                    }
                                    arrayList.add(new zzahc(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                                }
                                list.add(new zzahd(arrayList));
                            } else if (c10 == 2816) {
                            }
                            break;
                            break;
                        case -1251387154:
                            if (!strZzB.equals("Super_SlowMotion_Data")) {
                                throw zzbh.zza("Invalid SEF name", null);
                            }
                            c10 = 2816;
                            i = zzajbVar.zzb - (iZzi + 8);
                            if (c10 == 2192) {
                                arrayList = new ArrayList();
                                listZze = zzb.zze(zzedVar.zzB(i, charset));
                                while (i10 < listZze.size()) {
                                    listZze2 = zza.zze((CharSequence) listZze.get(i10));
                                    if (listZze2.size() != 3) {
                                        throw zzbh.zza(null, null);
                                    }
                                    arrayList.add(new zzahc(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                                }
                                list.add(new zzahd(arrayList));
                            } else if (c10 == 2816) {
                            }
                            break;
                            break;
                        case -830665521:
                            if (!strZzB.equals("Super_SlowMotion_Deflickering_On")) {
                                throw zzbh.zza("Invalid SEF name", null);
                            }
                            c10 = 2820;
                            i = zzajbVar.zzb - (iZzi + 8);
                            if (c10 == 2192) {
                                arrayList = new ArrayList();
                                listZze = zzb.zze(zzedVar.zzB(i, charset));
                                while (i10 < listZze.size()) {
                                    listZze2 = zza.zze((CharSequence) listZze.get(i10));
                                    if (listZze2.size() != 3) {
                                        throw zzbh.zza(null, null);
                                    }
                                    arrayList.add(new zzahc(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                                }
                                list.add(new zzahd(arrayList));
                            } else if (c10 == 2816) {
                            }
                            break;
                            break;
                        case 1760745220:
                            if (!strZzB.equals("Super_SlowMotion_BGM")) {
                                throw zzbh.zza("Invalid SEF name", null);
                            }
                            c10 = 2817;
                            i = zzajbVar.zzb - (iZzi + 8);
                            if (c10 == 2192) {
                                arrayList = new ArrayList();
                                listZze = zzb.zze(zzedVar.zzB(i, charset));
                                while (i10 < listZze.size()) {
                                    listZze2 = zza.zze((CharSequence) listZze.get(i10));
                                    if (listZze2.size() != 3) {
                                        throw zzbh.zza(null, null);
                                    }
                                    arrayList.add(new zzahc(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                                }
                                list.add(new zzahd(arrayList));
                            } else if (c10 == 2816) {
                            }
                            break;
                            break;
                        default:
                            throw zzbh.zza("Invalid SEF name", null);
                    }
                }
                zzadnVar.zza = 0L;
            } else {
                long jZzd2 = zzacsVar.zzd();
                int i14 = this.zze - 20;
                zzed zzedVar2 = new zzed(i14);
                zzacsVar.zzi(zzedVar2.zzN(), 0, i14);
                int i15 = 0;
                while (i15 < i14 / 12) {
                    zzedVar2.zzM(2);
                    short sZzD = zzedVar2.zzD();
                    if (sZzD == s14 || sZzD == s13 || sZzD == s12 || sZzD == s11 || sZzD == s10) {
                        this.zzc.add(new zzajb(sZzD, (jZzd2 - ((long) this.zze)) - ((long) zzedVar2.zzi()), zzedVar2.zzi()));
                    } else {
                        zzedVar2.zzM(i12);
                    }
                    i15++;
                    i12 = 8;
                    s10 = 2820;
                    s11 = 2819;
                    s12 = 2817;
                    s13 = 2816;
                    s14 = 2192;
                }
                if (this.zzc.isEmpty()) {
                    zzadnVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzadnVar.zza = ((zzajb) this.zzc.get(0)).zza;
                }
            }
        } else {
            zzed zzedVar3 = new zzed(8);
            zzacsVar.zzi(zzedVar3.zzN(), 0, 8);
            this.zze = zzedVar3.zzi() + 8;
            if (zzedVar3.zzg() != 1397048916) {
                zzadnVar.zza = 0L;
            } else {
                zzadnVar.zza = zzacsVar.zzf() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }
}
