package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzvn implements zzzb, zzug {
    final /* synthetic */ zzvs zza;
    private final Uri zzc;
    private final zzhc zzd;
    private final zzvh zze;
    private final zzacu zzf;
    private final zzdf zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzadx zzm;
    private boolean zzn;
    private final zzadn zzh = new zzadn();
    private boolean zzj = true;
    private final long zzb = zzui.zza();
    private zzgi zzl = zzi(0);

    public zzvn(zzvs zzvsVar, Uri uri, zzgd zzgdVar, zzvh zzvhVar, zzacu zzacuVar, zzdf zzdfVar) {
        this.zza = zzvsVar;
        this.zzc = uri;
        this.zzd = new zzhc(zzgdVar);
        this.zze = zzvhVar;
        this.zzf = zzacuVar;
        this.zzg = zzdfVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzvn zzvnVar, long j4, long j10) {
        zzvnVar.zzh.zza = j4;
        zzvnVar.zzk = j10;
        zzvnVar.zzj = true;
        zzvnVar.zzn = false;
    }

    private final zzgi zzi(long j4) {
        zzgg zzggVar = new zzgg();
        zzggVar.zzd(this.zzc);
        zzggVar.zzc(j4);
        zzggVar.zza(6);
        zzggVar.zzb(zzvs.zzb);
        return zzggVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zza(zzed zzedVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(zzvs.zzr(this.zza, true), this.zzk);
        int iZzb = zzedVar.zzb();
        zzadx zzadxVar = this.zzm;
        zzadxVar.getClass();
        zzadxVar.zzq(zzedVar, iZzb);
        zzadxVar.zzs(jMax, 1, iZzb, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[LOOP:0: B:3:0x0004->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00af A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0179  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x019a A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f3  */
    @Override // com.google.android.gms.internal.ads.zzzb
    public final void zzh() throws Throwable {
        long j4;
        boolean z4;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean zEquals;
        List list5;
        int i10;
        zzhc zzhcVar;
        zzvs zzvsVar;
        zzn zznVar;
        int iZza;
        zzvh zzvhVar;
        long jZzb;
        String str4;
        int i11;
        int i12;
        while (!this.zzi) {
            int i13 = 0;
            try {
                long j10 = this.zzh.zza;
                zzgi zzgiVarZzi = zzi(j10);
                this.zzl = zzgiVarZzi;
                long jZzb2 = this.zzd.zzb(zzgiVarZzi);
                if (this.zzi) {
                    zzvh zzvhVar2 = this.zze;
                    if (zzvhVar2.zzb() != -1) {
                        this.zzh.zza = zzvhVar2.zzb();
                    }
                    zzgf.zza(this.zzd);
                    return;
                }
                if (jZzb2 != -1) {
                    jZzb2 += j10;
                    zzvs.zzC(this.zza);
                }
                long j11 = jZzb2;
                zzvs zzvsVar2 = this.zza;
                Map mapZze = this.zzd.zze();
                List list6 = (List) mapZze.get("icy-br");
                try {
                    if (list6 != null) {
                        String str5 = (String) list6.get(0);
                        try {
                            i12 = Integer.parseInt(str5) * zzbbs.zzq.zzf;
                            if (i12 > 0) {
                                j4 = -1;
                                z4 = true;
                                i = i12;
                                list = (List) mapZze.get("icy-genre");
                                if (list != null) {
                                    str = (String) list.get(0);
                                    z4 = true;
                                } else {
                                    str = null;
                                }
                                list2 = (List) mapZze.get("icy-name");
                                if (list2 != null) {
                                    str2 = (String) list2.get(0);
                                    z4 = true;
                                } else {
                                    str2 = null;
                                }
                                list3 = (List) mapZze.get("icy-url");
                                if (list3 != null) {
                                    str3 = (String) list3.get(0);
                                    z4 = true;
                                } else {
                                    str3 = null;
                                }
                                list4 = (List) mapZze.get("icy-pub");
                                if (list4 != null) {
                                    zEquals = ((String) list4.get(0)).equals("1");
                                    z4 = true;
                                } else {
                                    zEquals = false;
                                }
                                list5 = (List) mapZze.get("icy-metaint");
                                if (list5 != null) {
                                    str4 = (String) list5.get(0);
                                    try {
                                        i11 = Integer.parseInt(str4);
                                        if (i11 > 0) {
                                            z4 = true;
                                            i10 = i11;
                                        } else {
                                            try {
                                                zzdt.zzf("IcyHeaders", "Invalid metadata interval: " + str4);
                                                i10 = -1;
                                            } catch (NumberFormatException unused) {
                                                zzdt.zzf("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str4)));
                                                i10 = i11;
                                            }
                                        }
                                    } catch (NumberFormatException unused2) {
                                        i11 = -1;
                                    }
                                } else {
                                    i10 = -1;
                                }
                                zzvsVar2.zzs = z4 ? new zzafv(i, str, str2, str3, zEquals, i10) : null;
                                zzhcVar = this.zzd;
                                zzvsVar = this.zza;
                                if (zzvsVar.zzs != null || zzvsVar.zzs.zzf == -1) {
                                    zznVar = zzhcVar;
                                } else {
                                    zzuh zzuhVar = new zzuh(zzhcVar, zzvsVar.zzs.zzf, this);
                                    zzadx zzadxVarZzv = this.zza.zzv();
                                    this.zzm = zzadxVarZzv;
                                    zzadxVarZzv.zzl(zzvs.zzc);
                                    zznVar = zzuhVar;
                                }
                                this.zze.zzd(zznVar, this.zzc, this.zzd.zze(), j10, j11, this.zzf);
                                if (this.zza.zzs != null) {
                                    this.zze.zzc();
                                }
                                if (this.zzj) {
                                    this.zze.zzf(j10, this.zzk);
                                    this.zzj = false;
                                }
                                iZza = 0;
                                while (iZza == 0) {
                                    try {
                                        if (!this.zzi) {
                                            iZza = 0;
                                            break;
                                        }
                                        try {
                                            this.zzg.zza();
                                            iZza = this.zze.zza(this.zzh);
                                            jZzb = this.zze.zzb();
                                            if (jZzb > this.zza.zzj + j10) {
                                                this.zzg.zzc();
                                                zzvs zzvsVar3 = this.zza;
                                                zzvsVar3.zzq.post(zzvsVar3.zzp);
                                                j10 = jZzb;
                                            }
                                        } catch (InterruptedException unused3) {
                                            throw new InterruptedIOException();
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        i13 = iZza;
                                        if (i13 != 1) {
                                            zzvh zzvhVar3 = this.zze;
                                            if (zzvhVar3.zzb() != j4) {
                                                this.zzh.zza = zzvhVar3.zzb();
                                            }
                                        }
                                        zzgf.zza(this.zzd);
                                        throw th;
                                    }
                                }
                                if (iZza != 1) {
                                    zzvhVar = this.zze;
                                    if (zzvhVar.zzb() != j4) {
                                        this.zzh.zza = zzvhVar.zzb();
                                    }
                                    i13 = iZza;
                                }
                                zzgf.zza(this.zzd);
                                if (i13 != 0) {
                                    return;
                                }
                            } else {
                                j4 = -1;
                                try {
                                    zzdt.zzf("IcyHeaders", "Invalid bitrate: " + str5);
                                } catch (NumberFormatException unused4) {
                                    zzdt.zzf("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                                    z4 = false;
                                    i = i12;
                                }
                            }
                        } catch (NumberFormatException unused5) {
                            j4 = -1;
                            i12 = -1;
                        }
                    } else {
                        j4 = -1;
                    }
                    list = (List) mapZze.get("icy-genre");
                    if (list != null) {
                        str = (String) list.get(0);
                        z4 = true;
                    } else {
                        str = null;
                    }
                    list2 = (List) mapZze.get("icy-name");
                    if (list2 != null) {
                        str2 = (String) list2.get(0);
                        z4 = true;
                    } else {
                        str2 = null;
                    }
                    list3 = (List) mapZze.get("icy-url");
                    if (list3 != null) {
                        str3 = (String) list3.get(0);
                        z4 = true;
                    } else {
                        str3 = null;
                    }
                    list4 = (List) mapZze.get("icy-pub");
                    if (list4 != null) {
                        zEquals = ((String) list4.get(0)).equals("1");
                        z4 = true;
                    } else {
                        zEquals = false;
                    }
                    list5 = (List) mapZze.get("icy-metaint");
                    if (list5 != null) {
                        str4 = (String) list5.get(0);
                        i11 = Integer.parseInt(str4);
                        if (i11 > 0) {
                            z4 = true;
                            i10 = i11;
                        } else {
                            zzdt.zzf("IcyHeaders", "Invalid metadata interval: " + str4);
                            i10 = -1;
                        }
                    } else {
                        i10 = -1;
                    }
                    zzvsVar2.zzs = z4 ? new zzafv(i, str, str2, str3, zEquals, i10) : null;
                    zzhcVar = this.zzd;
                    zzvsVar = this.zza;
                    if (zzvsVar.zzs != null) {
                        zznVar = zzhcVar;
                    } else {
                        zznVar = zzhcVar;
                    }
                    this.zze.zzd(zznVar, this.zzc, this.zzd.zze(), j10, j11, this.zzf);
                    if (this.zza.zzs != null) {
                        this.zze.zzc();
                    }
                    if (this.zzj) {
                        this.zze.zzf(j10, this.zzk);
                        this.zzj = false;
                    }
                    iZza = 0;
                    while (iZza == 0) {
                        if (!this.zzi) {
                            iZza = 0;
                            break;
                        }
                        this.zzg.zza();
                        iZza = this.zze.zza(this.zzh);
                        jZzb = this.zze.zzb();
                        if (jZzb > this.zza.zzj + j10) {
                            this.zzg.zzc();
                            zzvs zzvsVar4 = this.zza;
                            zzvsVar4.zzq.post(zzvsVar4.zzp);
                            j10 = jZzb;
                        }
                    }
                    if (iZza != 1) {
                        zzvhVar = this.zze;
                        if (zzvhVar.zzb() != j4) {
                            this.zzh.zza = zzvhVar.zzb();
                        }
                        i13 = iZza;
                    }
                    zzgf.zza(this.zzd);
                    if (i13 != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                z4 = false;
                i = -1;
            } catch (Throwable th3) {
                th = th3;
                j4 = -1;
            }
        }
    }
}
