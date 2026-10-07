package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzggc {
    private final List zza = new ArrayList();
    private final zzgnd zzb = zzgnd.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgga) it.next()).zza = false;
        }
    }

    public final zzggc zza(zzgga zzggaVar) {
        if (zzggaVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzggaVar.zza) {
            zzd();
        }
        zzggaVar.zzf = this;
        this.zza.add(zzggaVar);
        return this;
    }

    public final zzggf zzb() throws GeneralSecurityException {
        int i;
        int i10;
        int i11;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c10 = 1;
        this.zzc = true;
        List list = this.zza;
        zzgui zzguiVarZzc = zzgum.zzc();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.zza;
        int i12 = 0;
        int i13 = 0;
        while (i13 < list2.size() - 1) {
            int i14 = i13 + 1;
            if (((zzgga) list2.get(i13)).zze == zzggb.zza && ((zzgga) list2.get(i14)).zze != zzggb.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i13 = i14;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzgga zzggaVar : this.zza) {
            zzgfy unused = zzggaVar.zzb;
            if (zzggaVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (zzggaVar.zze == zzggb.zza) {
                int i15 = i12;
                while (true) {
                    if (i15 != 0 && !hashSet.contains(Integer.valueOf(i15))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i16 = i12;
                    while (i16 == 0) {
                        secureRandom.nextBytes(bArr);
                        i16 = ((bArr[2] & 255) << 8) | ((bArr[i12] & 255) << 24) | ((bArr[c10] & 255) << 16) | (bArr[3] & 255);
                        i12 = 0;
                    }
                    i15 = i16;
                }
                i10 = i15;
                i = 3;
            } else {
                i = 3;
                zzggb unused2 = zzggaVar.zze;
                i10 = 0;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(q1.a.j(i10, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzgga.zza(zzggaVar);
            zzgfw zzgfwVarZza = zzgnp.zzb().zza(zzggaVar.zzd, c10 != zzggaVar.zzd.zza() ? null : numValueOf);
            zzggd zzggdVar = new zzggd(zzgfwVarZza, zzggaVar.zzb, i10, zzggaVar.zza, null);
            int i17 = i10;
            zzgfy zzgfyVar = zzggaVar.zzb;
            zzgow zzgowVar = (zzgow) zzgnz.zzc().zzd(zzgfwVarZza, zzgow.class, zzggn.zza());
            Integer numZzf = zzgowVar.zzf();
            if (numZzf != null && numZzf.intValue() != i17) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            zzgfy zzgfyVar2 = zzgfy.zza;
            if (zzgfyVar2.equals(zzgfyVar)) {
                i11 = i;
            } else if (zzgfy.zzb.equals(zzgfyVar)) {
                i11 = 4;
            } else {
                if (!zzgfy.zzc.equals(zzgfyVar)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i11 = 5;
            }
            zzguj zzgujVarZzc = zzguk.zzc();
            zzgtx zzgtxVarZza = zzgua.zza();
            zzgtxVarZza.zzb(zzgowVar.zzg());
            zzgtxVarZza.zzc(zzgowVar.zze());
            zzgtxVarZza.zza(zzgowVar.zzb());
            zzgujVarZzc.zza(zzgtxVarZza);
            zzgujVarZzc.zzd(i11);
            zzgujVarZzc.zzb(i17);
            zzgujVarZzc.zzc(zzgowVar.zzc());
            zzguiVarZzc.zza((zzguk) zzgujVarZzc.zzbr());
            if (zzggaVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzggaVar.zzb != zzgfyVar2) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzggdVar);
            c10 = 1;
            i12 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzguiVarZzc.zzb(num.intValue());
        zzgum zzgumVar = (zzgum) zzguiVarZzc.zzbr();
        zzggf.zzh(zzgumVar);
        return new zzggf(zzgumVar, arrayList, this.zzb, null);
    }
}
