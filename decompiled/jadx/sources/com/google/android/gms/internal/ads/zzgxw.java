package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgxw implements zzhav {
    private final zzgxv zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgxw(zzgxv zzgxvVar) {
        zzgzk.zzc(zzgxvVar, "input");
        this.zza = zzgxvVar;
        zzgxvVar.zzc = this;
    }

    private final void zzO(Object obj, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzhbbVar.zzh(obj, this, zzgyhVar);
            if (this.zzb != this.zzc) {
                throw new zzgzm("Failed to parse the message.");
            }
            this.zzc = i;
        } catch (Throwable th) {
            this.zzc = i;
            throw th;
        }
    }

    private final void zzP(Object obj, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        zzgxv zzgxvVar = this.zza;
        int iZzm = zzgxvVar.zzm();
        if (zzgxvVar.zza >= zzgxvVar.zzb) {
            throw new zzgzm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iZzd = zzgxvVar.zzd(iZzm);
        this.zza.zza++;
        zzhbbVar.zzh(obj, this, zzgyhVar);
        this.zza.zzy(0);
        zzgxv zzgxvVar2 = this.zza;
        zzgxvVar2.zza--;
        zzgxvVar2.zzz(iZzd);
    }

    private final void zzQ(int i) throws IOException {
        if (this.zza.zzc() != i) {
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw new zzgzl("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new zzgzm("Failed to parse the message.");
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new zzgzm("Failed to parse the message.");
        }
    }

    public static zzgxw zzq(zzgxv zzgxvVar) {
        zzgxw zzgxwVar = zzgxvVar.zzc;
        return zzgxwVar != null ? zzgxwVar : new zzgxw(zzgxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzA(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgzxVar.zzg(this.zza.zzn());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgzxVar.zzg(this.zza.zzn());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzB(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyo) {
            zzgyo zzgyoVar = (zzgyo) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgyoVar.zzh(this.zza.zzb());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyoVar.zzh(this.zza.zzb());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i10 != 5) {
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    @Deprecated
    public final void zzC(List list, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        int iZzl;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw new zzgzl("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzhbbVar.zze();
            zzO(objZze, zzhbbVar, zzgyhVar);
            zzhbbVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == i);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzD(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar = this.zza;
                int iZzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                do {
                    zzgyyVar.zzi(this.zza.zzg());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgyyVar.zzi(this.zza.zzg());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar2 = this.zza;
                int iZzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzE(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar = this.zza;
                int iZzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                do {
                    zzgzxVar.zzg(this.zza.zzo());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgzxVar.zzg(this.zza.zzo());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar2 = this.zza;
                int iZzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzF(List list, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        int iZzl;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw new zzgzl("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzhbbVar.zze();
            zzP(objZze, zzhbbVar, zzgyhVar);
            zzhbbVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == i);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzG(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgyyVar.zzi(this.zza.zzj());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyyVar.zzi(this.zza.zzj());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i10 != 5) {
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzH(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgzxVar.zzg(this.zza.zzs());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgzxVar.zzg(this.zza.zzs());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzs()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzs()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzI(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar = this.zza;
                int iZzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                do {
                    zzgyyVar.zzi(this.zza.zzk());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgyyVar.zzi(this.zza.zzk());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar2 = this.zza;
                int iZzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzJ(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar = this.zza;
                int iZzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                do {
                    zzgzxVar.zzg(this.zza.zzt());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgzxVar.zzg(this.zza.zzt());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar2 = this.zza;
                int iZzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    public final void zzK(List list, boolean z4) throws IOException {
        int iZzl;
        int iZzl2;
        if ((this.zzb & 7) != 2) {
            throw new zzgzl("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzgzu) && !z4) {
            zzgzu zzgzuVar = (zzgzu) list;
            do {
                zzp();
                zzgzuVar.zzb();
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            do {
                list.add(z4 ? zzs() : zzr());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzL(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar = this.zza;
                int iZzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                do {
                    zzgyyVar.zzi(this.zza.zzm());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgyyVar.zzi(this.zza.zzm());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar2 = this.zza;
                int iZzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzM(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar = this.zza;
                int iZzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                do {
                    zzgzxVar.zzg(this.zza.zzu());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgzxVar.zzg(this.zza.zzu());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar2 = this.zza;
                int iZzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final boolean zzN() throws IOException {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final double zza() throws IOException {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final float zzb() throws IOException {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzc() throws IOException {
        int iZzl = this.zzd;
        if (iZzl != 0) {
            this.zzb = iZzl;
            this.zzd = 0;
        } else {
            iZzl = this.zza.zzl();
            this.zzb = iZzl;
        }
        return (iZzl == 0 || iZzl == this.zzc) ? f.API_PRIORITY_OTHER : iZzl >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zze() throws IOException {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzf() throws IOException {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzg() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzh() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzj() throws IOException {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final long zzk() throws IOException {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final long zzl() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final long zzm() throws IOException {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final long zzn() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final long zzo() throws IOException {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final zzgxp zzp() throws IOException {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final String zzr() throws IOException {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final String zzs() throws IOException {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzt(Object obj, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        zzR(3);
        zzO(obj, zzhbbVar, zzgyhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzu(Object obj, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        zzR(2);
        zzP(obj, zzhbbVar, zzgyhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzv(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxf) {
            zzgxf zzgxfVar = (zzgxf) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar = this.zza;
                int iZzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                do {
                    zzgxfVar.zzg(this.zza.zzB());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxfVar.zzg(this.zza.zzB());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar2 = this.zza;
                int iZzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                do {
                    list.add(Boolean.valueOf(this.zza.zzB()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzB()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzw(List list) throws IOException {
        int iZzl;
        if ((this.zzb & 7) != 2) {
            throw new zzgzl("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.zza.zzA()) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == this.zzb);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzx(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgye) {
            zzgye zzgyeVar = (zzgye) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgyeVar.zzh(this.zza.zza());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgyeVar.zzh(this.zza.zza());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzy(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar = this.zza;
                int iZzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                do {
                    zzgyyVar.zzi(this.zza.zze());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgyyVar.zzi(this.zza.zze());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                zzgxv zzgxvVar2 = this.zza;
                int iZzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzz(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgyyVar.zzi(this.zza.zzf());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyyVar.zzi(this.zza.zzf());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i10 != 5) {
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }
}
