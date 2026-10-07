package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import e6.j2;
import e6.o3;
import e6.q3;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbre extends zzayd implements zzbrf {
    public zzbre() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbrf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbrf ? (zzbrf) iInterfaceQueryLocalInterface : new zzbrd(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.zzbre, com.google.android.gms.internal.ads.zzbrf] */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.zzbrc] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.zzbqz] */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.google.android.gms.internal.ads.zzbrc] */
    /* JADX WARN: Type inference failed for: r5v21, types: [com.google.android.gms.internal.ads.zzbqt] */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.gms.internal.ads.zzbqz] */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.google.android.gms.internal.ads.zzbqq] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzbqt] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.google.android.gms.internal.ads.zzbqw] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.ads.zzbri] */
    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        IInterface zzbqoVar = null;
        if (i == 1) {
            q7.a aVarY = b.y(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzaye.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzaye.zza(parcel, creator);
            q3 q3Var = (q3) zzaye.zza(parcel, q3.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbqoVar = iInterfaceQueryLocalInterface instanceof zzbri ? (zzbri) iInterfaceQueryLocalInterface : new zzbrg(strongBinder);
            }
            zzaye.zzc(parcel);
            zzh(aVarY, string, bundle, bundle2, q3Var, zzbqoVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbru zzbruVarZzf = zzf();
            parcel2.writeNoException();
            zzaye.zze(parcel2, zzbruVarZzf);
        } else if (i == 3) {
            zzbru zzbruVarZzg = zzg();
            parcel2.writeNoException();
            zzaye.zze(parcel2, zzbruVarZzg);
        } else if (i == 5) {
            j2 j2VarZze = zze();
            parcel2.writeNoException();
            zzaye.zzf(parcel2, j2VarZze);
        } else if (i == 10) {
            b.y(parcel.readStrongBinder());
            zzaye.zzc(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    o3 o3Var = (o3) zzaye.zza(parcel, o3.CREATOR);
                    q7.a aVarY2 = b.y(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqoVar = iInterfaceQueryLocalInterface2 instanceof zzbqt ? (zzbqt) iInterfaceQueryLocalInterface2 : new zzbqr(strongBinder2);
                    }
                    ?? r10 = zzbqoVar;
                    zzbpm zzbpmVarZzb = zzbpl.zzb(parcel.readStrongBinder());
                    q3 q3Var2 = (q3) zzaye.zza(parcel, q3.CREATOR);
                    zzaye.zzc(parcel);
                    zzj(string2, string3, o3Var, aVarY2, r10, zzbpmVarZzb, q3Var2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    o3 o3Var2 = (o3) zzaye.zza(parcel, o3.CREATOR);
                    q7.a aVarY3 = b.y(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbqoVar = iInterfaceQueryLocalInterface3 instanceof zzbqw ? (zzbqw) iInterfaceQueryLocalInterface3 : new zzbqu(strongBinder3);
                    }
                    zzbpm zzbpmVarZzb2 = zzbpl.zzb(parcel.readStrongBinder());
                    zzaye.zzc(parcel);
                    zzl(string4, string5, o3Var2, aVarY3, zzbqoVar, zzbpmVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    q7.a aVarY4 = b.y(parcel.readStrongBinder());
                    zzaye.zzc(parcel);
                    boolean zZzs = zzs(aVarY4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzs ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    o3 o3Var3 = (o3) zzaye.zza(parcel, o3.CREATOR);
                    q7.a aVarY5 = b.y(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqoVar = iInterfaceQueryLocalInterface4 instanceof zzbrc ? (zzbrc) iInterfaceQueryLocalInterface4 : new zzbra(strongBinder4);
                    }
                    zzbpm zzbpmVarZzb3 = zzbpl.zzb(parcel.readStrongBinder());
                    zzaye.zzc(parcel);
                    zzp(string6, string7, o3Var3, aVarY5, zzbqoVar, zzbpmVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    q7.a aVarY6 = b.y(parcel.readStrongBinder());
                    zzaye.zzc(parcel);
                    boolean zZzt = zzt(aVarY6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    o3 o3Var4 = (o3) zzaye.zza(parcel, o3.CREATOR);
                    q7.a aVarY7 = b.y(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqoVar = iInterfaceQueryLocalInterface5 instanceof zzbqz ? (zzbqz) iInterfaceQueryLocalInterface5 : new zzbqx(strongBinder5);
                    }
                    zzbpm zzbpmVarZzb4 = zzbpl.zzb(parcel.readStrongBinder());
                    zzaye.zzc(parcel);
                    zzm(string8, string9, o3Var4, aVarY7, zzbqoVar, zzbpmVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzaye.zzc(parcel);
                    zzq(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    o3 o3Var5 = (o3) zzaye.zza(parcel, o3.CREATOR);
                    q7.a aVarY8 = b.y(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqoVar = iInterfaceQueryLocalInterface6 instanceof zzbrc ? (zzbrc) iInterfaceQueryLocalInterface6 : new zzbra(strongBinder6);
                    }
                    zzbpm zzbpmVarZzb5 = zzbpl.zzb(parcel.readStrongBinder());
                    zzaye.zzc(parcel);
                    zzo(string11, string12, o3Var5, aVarY8, zzbqoVar, zzbpmVarZzb5);
                    parcel2.writeNoException();
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    o3 o3Var6 = (o3) zzaye.zza(parcel, o3.CREATOR);
                    q7.a aVarY9 = b.y(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqoVar = iInterfaceQueryLocalInterface7 instanceof zzbqt ? (zzbqt) iInterfaceQueryLocalInterface7 : new zzbqr(strongBinder7);
                    }
                    ?? r11 = zzbqoVar;
                    zzbpm zzbpmVarZzb6 = zzbpl.zzb(parcel.readStrongBinder());
                    q3 q3Var3 = (q3) zzaye.zza(parcel, q3.CREATOR);
                    zzaye.zzc(parcel);
                    zzk(string13, string14, o3Var6, aVarY9, r11, zzbpmVarZzb6, q3Var3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    o3 o3Var7 = (o3) zzaye.zza(parcel, o3.CREATOR);
                    q7.a aVarY10 = b.y(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqoVar = iInterfaceQueryLocalInterface8 instanceof zzbqz ? (zzbqz) iInterfaceQueryLocalInterface8 : new zzbqx(strongBinder8);
                    }
                    zzbpm zzbpmVarZzb7 = zzbpl.zzb(parcel.readStrongBinder());
                    zzbfn zzbfnVar = (zzbfn) zzaye.zza(parcel, zzbfn.CREATOR);
                    zzaye.zzc(parcel);
                    zzn(string15, string16, o3Var7, aVarY10, zzbqoVar, zzbpmVarZzb7, zzbfnVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    o3 o3Var8 = (o3) zzaye.zza(parcel, o3.CREATOR);
                    q7.a aVarY11 = b.y(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbqoVar = iInterfaceQueryLocalInterface9 instanceof zzbqq ? (zzbqq) iInterfaceQueryLocalInterface9 : new zzbqo(strongBinder9);
                    }
                    zzbpm zzbpmVarZzb8 = zzbpl.zzb(parcel.readStrongBinder());
                    zzaye.zzc(parcel);
                    zzi(string17, string18, o3Var8, aVarY11, zzbqoVar, zzbpmVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    q7.a aVarY12 = b.y(parcel.readStrongBinder());
                    zzaye.zzc(parcel);
                    boolean zZzr = zzr(aVarY12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzaye.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
