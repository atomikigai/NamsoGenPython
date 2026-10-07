package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagu extends zzagl {
    public static final Parcelable.Creator<zzagu> CREATOR = new zzagt();
    public final String zza;
    public final zzfzo zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzagu(String str, String str2, List list) {
        super(str);
        zzdb.zzd(!list.isEmpty());
        this.zza = str2;
        zzfzo zzfzoVarZzl = zzfzo.zzl(list);
        this.zzb = zzfzoVarZzl;
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagu.class == obj.getClass()) {
            zzagu zzaguVar = (zzagu) obj;
            if (Objects.equals(this.zzf, zzaguVar.zzf) && Objects.equals(this.zza, zzaguVar.zza) && this.zzb.equals(zzaguVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagl
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + String.valueOf(this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzb.toArray(new String[0]));
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0183 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x0205, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x0205, blocks: (B:69:0x0125, B:82:0x017a, B:84:0x0183, B:86:0x018f, B:102:0x01de), top: B:113:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:85:0x018e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzagl, com.google.android.gms.internal.ads.zzbc
    public final void zza(zzay zzayVar) {
        String[] strArrSplit;
        Integer numValueOf;
        String str = this.zzf;
        try {
            switch (str.hashCode()) {
                case 82815:
                    if (!str.equals("TAL")) {
                    }
                    zzayVar.zzd((CharSequence) this.zzb.get(0));
                    break;
                case 82878:
                    if (!str.equals("TCM")) {
                    }
                    zzayVar.zzf((CharSequence) this.zzb.get(0));
                    break;
                case 82897:
                    if (!str.equals("TDA")) {
                    }
                    String str2 = (String) this.zzb.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i10 = Integer.parseInt(str2.substring(0, 2));
                    zzayVar.zzk(Integer.valueOf(i));
                    zzayVar.zzj(Integer.valueOf(i10));
                    break;
                case 83253:
                    if (!str.equals("TP1")) {
                    }
                    zzayVar.zze((CharSequence) this.zzb.get(0));
                    break;
                case 83254:
                    if (!str.equals("TP2")) {
                    }
                    zzayVar.zzc((CharSequence) this.zzb.get(0));
                    break;
                case 83255:
                    if (!str.equals("TP3")) {
                    }
                    zzayVar.zzg((CharSequence) this.zzb.get(0));
                    break;
                case 83341:
                    if (!str.equals("TRK")) {
                    }
                    String str3 = (String) this.zzb.get(0);
                    int i11 = zzen.zza;
                    strArrSplit = str3.split("/", -1);
                    int i12 = Integer.parseInt(strArrSplit[0]);
                    if (strArrSplit.length > 1) {
                        numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                    } else {
                        numValueOf = null;
                    }
                    zzayVar.zzs(Integer.valueOf(i12));
                    zzayVar.zzr(numValueOf);
                    break;
                case 83378:
                    if (!str.equals("TT2")) {
                    }
                    zzayVar.zzq((CharSequence) this.zzb.get(0));
                    break;
                case 83536:
                    if (!str.equals("TXT")) {
                    }
                    zzayVar.zzt((CharSequence) this.zzb.get(0));
                    break;
                case 83552:
                    if (!str.equals("TYE")) {
                    }
                    zzayVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    break;
                case 2567331:
                    if (!str.equals("TALB")) {
                    }
                    zzayVar.zzd((CharSequence) this.zzb.get(0));
                    break;
                case 2569357:
                    if (!str.equals("TCOM")) {
                    }
                    zzayVar.zzf((CharSequence) this.zzb.get(0));
                    break;
                case 2569358:
                    if (str.equals("TCON")) {
                        Integer numZzf = zzgcr.zzf((String) this.zzb.get(0), 10);
                        if (numZzf != null) {
                            String strZza = zzagm.zza(numZzf.intValue());
                            if (strZza != null) {
                                zzayVar.zzi(strZza);
                            }
                        } else {
                            zzayVar.zzi((CharSequence) this.zzb.get(0));
                        }
                    }
                    break;
                case 2569891:
                    if (!str.equals("TDAT")) {
                    }
                    String str4 = (String) this.zzb.get(0);
                    int i13 = Integer.parseInt(str4.substring(2, 4));
                    int i14 = Integer.parseInt(str4.substring(0, 2));
                    zzayVar.zzk(Integer.valueOf(i13));
                    zzayVar.zzj(Integer.valueOf(i14));
                    break;
                case 2570401:
                    if (str.equals("TDRC")) {
                        List listZzb = zzb((String) this.zzb.get(0));
                        int size = listZzb.size();
                        if (size != 1) {
                            if (size != 2) {
                                if (size == 3) {
                                    zzayVar.zzj((Integer) listZzb.get(2));
                                }
                            }
                            zzayVar.zzk((Integer) listZzb.get(1));
                        }
                        zzayVar.zzl((Integer) listZzb.get(0));
                    }
                    break;
                case 2570410:
                    if (str.equals("TDRL")) {
                        List listZzb2 = zzb((String) this.zzb.get(0));
                        int size2 = listZzb2.size();
                        if (size2 != 1) {
                            if (size2 != 2) {
                                if (size2 == 3) {
                                    zzayVar.zzm((Integer) listZzb2.get(2));
                                }
                            }
                            zzayVar.zzn((Integer) listZzb2.get(1));
                        }
                        zzayVar.zzo((Integer) listZzb2.get(0));
                    }
                    break;
                case 2571565:
                    if (!str.equals("TEXT")) {
                    }
                    zzayVar.zzt((CharSequence) this.zzb.get(0));
                    break;
                case 2575251:
                    if (!str.equals("TIT2")) {
                    }
                    zzayVar.zzq((CharSequence) this.zzb.get(0));
                    break;
                case 2581512:
                    if (!str.equals("TPE1")) {
                    }
                    zzayVar.zze((CharSequence) this.zzb.get(0));
                    break;
                case 2581513:
                    if (!str.equals("TPE2")) {
                    }
                    zzayVar.zzc((CharSequence) this.zzb.get(0));
                    break;
                case 2581514:
                    if (!str.equals("TPE3")) {
                    }
                    zzayVar.zzg((CharSequence) this.zzb.get(0));
                    break;
                case 2583398:
                    if (!str.equals("TRCK")) {
                    }
                    String str5 = (String) this.zzb.get(0);
                    int i15 = zzen.zza;
                    strArrSplit = str5.split("/", -1);
                    int i16 = Integer.parseInt(strArrSplit[0]);
                    if (strArrSplit.length > 1) {
                        numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                    } else {
                        numValueOf = null;
                    }
                    zzayVar.zzs(Integer.valueOf(i16));
                    zzayVar.zzr(numValueOf);
                    break;
                case 2590194:
                    if (!str.equals("TYER")) {
                    }
                    zzayVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
