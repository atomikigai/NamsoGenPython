package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzki implements zzkr {
    private final zzke zza;
    private final zzll zzb;
    private final boolean zzc;
    private final zzif zzd;

    private zzki(zzll zzllVar, zzif zzifVar, zzke zzkeVar) {
        this.zzb = zzllVar;
        this.zzc = zzifVar.zzj(zzkeVar);
        this.zzd = zzifVar;
        this.zza = zzkeVar;
    }

    public static zzki zzc(zzll zzllVar, zzif zzifVar, zzke zzkeVar) {
        return new zzki(zzllVar, zzifVar, zzkeVar);
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zza(Object obj) {
        zzll zzllVar = this.zzb;
        int iZzb = zzllVar.zzb(zzllVar.zzd(obj));
        return this.zzc ? iZzb + this.zzd.zzb(obj).zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final Object zze() {
        zzke zzkeVar = this.zza;
        return zzkeVar instanceof zzit ? ((zzit) zzkeVar).zzs() : zzkeVar.zzW().zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzg(Object obj, Object obj2) {
        zzkt.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzkt.zzq(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzh(Object obj, zzkq zzkqVar, zzie zzieVar) throws IOException {
        boolean zZzO;
        zzll zzllVar = this.zzb;
        Object objZzc = zzllVar.zzc(obj);
        zzif zzifVar = this.zzd;
        zzij zzijVarZzc = zzifVar.zzc(obj);
        while (zzkqVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzkqVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzd = zzifVar.zzd(zzieVar, this.zza, iZzd >>> 3);
                        if (objZzd != null) {
                            zzifVar.zzg(zzkqVar, objZzd, zzieVar, zzijVarZzc);
                        } else {
                            zZzO = zzllVar.zzr(objZzc, zzkqVar);
                        }
                    } else {
                        zZzO = zzkqVar.zzO();
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    Object objZzd2 = null;
                    int iZzj = 0;
                    zzgw zzgwVarZzp = null;
                    while (zzkqVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzkqVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzkqVar.zzj();
                            objZzd2 = zzifVar.zzd(zzieVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzd2 != null) {
                                zzifVar.zzg(zzkqVar, objZzd2, zzieVar, zzijVarZzc);
                            } else {
                                zzgwVarZzp = zzkqVar.zzp();
                            }
                        } else if (!zzkqVar.zzO()) {
                            break;
                        }
                    }
                    if (zzkqVar.zzd() != 12) {
                        throw zzje.zzb();
                    }
                    if (zzgwVarZzp != null) {
                        if (objZzd2 != null) {
                            zzifVar.zzh(zzgwVarZzp, objZzd2, zzieVar, zzijVarZzc);
                        } else {
                            zzllVar.zzk(objZzc, iZzj, zzgwVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                zzllVar.zzn(obj, objZzc);
                throw th;
            }
        }
        zzllVar.zzn(obj, objZzc);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[EDGE_INSN: B:58:0x008f->B:35:0x008f BREAK  A[LOOP:1: B:18:0x0050->B:63:0x0050], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzi(Object obj, byte[] bArr, int i, int i10, zzgj zzgjVar) throws IOException {
        int iZzi;
        zzit zzitVar = (zzit) obj;
        zzlm zzlmVarZzf = zzitVar.zzc;
        if (zzlmVarZzf == zzlm.zzc()) {
            zzlmVarZzf = zzlm.zzf();
            zzitVar.zzc = zzlmVarZzf;
        }
        zzlm zzlmVar = zzlmVarZzf;
        ((zzip) obj).zzi();
        Object objZzd = null;
        while (i < i10) {
            int iZzi2 = zzgk.zzi(bArr, i, zzgjVar);
            int i11 = zzgjVar.zza;
            if (i11 == 11) {
                byte[] bArr2 = bArr;
                int i12 = i10;
                zzgj zzgjVar2 = zzgjVar;
                int i13 = 0;
                zzgw zzgwVar = null;
                while (true) {
                    if (iZzi2 >= i12) {
                        iZzi = iZzi2;
                        break;
                    }
                    iZzi = zzgk.zzi(bArr2, iZzi2, zzgjVar2);
                    int i14 = zzgjVar2.zza;
                    int i15 = i14 >>> 3;
                    int i16 = i14 & 7;
                    if (i15 == 2) {
                        if (i16 != 0) {
                            if (i14 != 12) {
                                break;
                                break;
                            }
                            iZzi2 = zzgk.zzo(i14, bArr2, iZzi, i12, zzgjVar2);
                        } else {
                            iZzi2 = zzgk.zzi(bArr2, iZzi, zzgjVar2);
                            i13 = zzgjVar2.zza;
                            objZzd = this.zzd.zzd(zzgjVar2.zzd, this.zza, i13);
                        }
                    } else {
                        if (i15 == 3) {
                            if (objZzd != null) {
                                int i17 = zzkn.zza;
                                throw null;
                            }
                            if (i16 == 2) {
                                iZzi2 = zzgk.zza(bArr2, iZzi, zzgjVar2);
                                zzgwVar = (zzgw) zzgjVar2.zzc;
                            }
                        }
                        if (i14 != 12) {
                            break;
                        } else {
                            iZzi2 = zzgk.zzo(i14, bArr2, iZzi, i12, zzgjVar2);
                        }
                    }
                }
                if (zzgwVar != null) {
                    zzlmVar.zzj((i13 << 3) | 2, zzgwVar);
                }
                i = iZzi;
                bArr = bArr2;
                i10 = i12;
                zzgjVar = zzgjVar2;
            } else if ((i11 & 7) == 2) {
                objZzd = this.zzd.zzd(zzgjVar.zzd, this.zza, i11 >>> 3);
                if (objZzd != null) {
                    int i18 = zzkn.zza;
                    throw null;
                }
                i = zzgk.zzh(i11, bArr, iZzi2, i10, zzlmVar, zzgjVar);
            } else {
                i = zzgk.zzo(i11, bArr, iZzi2, i10, zzgjVar);
            }
        }
        if (i != i10) {
            throw zzje.zzg();
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzj(Object obj, zzmd zzmdVar) throws IOException {
        Iterator itZzf = this.zzd.zzb(obj).zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzii zziiVar = (zzii) entry.getKey();
            if (zziiVar.zze() != zzmc.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zziiVar.zzg();
            zziiVar.zzf();
            if (entry instanceof zzjh) {
                zzmdVar.zzw(zziiVar.zza(), ((zzjh) entry).zza().zzb());
            } else {
                zzmdVar.zzw(zziiVar.zza(), entry.getValue());
            }
        }
        zzll zzllVar = this.zzb;
        zzllVar.zzp(zzllVar.zzd(obj), zzmdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzk(Object obj, Object obj2) {
        zzll zzllVar = this.zzb;
        if (!zzllVar.zzd(obj).equals(zzllVar.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzl(Object obj) {
        return this.zzd.zzb(obj).zzk();
    }
}
