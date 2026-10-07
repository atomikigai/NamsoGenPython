package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.webkit.TracingConfig;
import e6.j2;
import e6.o3;
import e6.q3;
import java.util.ArrayList;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbpi extends zzayd implements zzbpj {
    public zzbpi() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbpm zzbpkVar;
        zzbpm zzbpkVar2;
        zzbpm zzbpkVar3;
        zzbpm zzbpkVar4;
        zzbpm zzbpkVar5;
        zzbpm zzbpkVar6;
        zzbpm zzbpkVar7;
        zzbpm zzbpkVar8;
        zzbpm zzbpkVar9 = null;
        switch (i) {
            case 1:
                q7.a aVarY = b.y(parcel.readStrongBinder());
                q3 q3Var = (q3) zzaye.zza(parcel, q3.CREATOR);
                o3 o3Var = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbpkVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpkVar = iInterfaceQueryLocalInterface instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface : new zzbpk(strongBinder);
                }
                zzaye.zzc(parcel);
                zzu(aVarY, q3Var, o3Var, string, zzbpkVar);
                parcel2.writeNoException();
                return true;
            case 2:
                q7.a aVarZzn = zzn();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, aVarZzn);
                return true;
            case 3:
                q7.a aVarY2 = b.y(parcel.readStrongBinder());
                o3 o3Var2 = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbpkVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpkVar2 = iInterfaceQueryLocalInterface2 instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface2 : new zzbpk(strongBinder2);
                }
                zzaye.zzc(parcel);
                zzx(aVarY2, o3Var2, string2, zzbpkVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                q7.a aVarY3 = b.y(parcel.readStrongBinder());
                q3 q3Var2 = (q3) zzaye.zza(parcel, q3.CREATOR);
                o3 o3Var3 = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    zzbpkVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpkVar3 = iInterfaceQueryLocalInterface3 instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface3 : new zzbpk(strongBinder3);
                }
                zzaye.zzc(parcel);
                zzv(aVarY3, q3Var2, o3Var3, string3, string4, zzbpkVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                q7.a aVarY4 = b.y(parcel.readStrongBinder());
                o3 o3Var4 = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    zzbpkVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpkVar4 = iInterfaceQueryLocalInterface4 instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface4 : new zzbpk(strongBinder4);
                }
                zzaye.zzc(parcel);
                zzy(aVarY4, o3Var4, string5, string6, zzbpkVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                q7.a aVarY5 = b.y(parcel.readStrongBinder());
                o3 o3Var5 = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string7 = parcel.readString();
                zzbwu zzbwuVarZzb = zzbwt.zzb(parcel.readStrongBinder());
                String string8 = parcel.readString();
                zzaye.zzc(parcel);
                zzp(aVarY5, o3Var5, string7, zzbwuVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                o3 o3Var6 = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string9 = parcel.readString();
                zzaye.zzc(parcel);
                zzs(o3Var6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                int i11 = zzaye.zza;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                q7.a aVarY6 = b.y(parcel.readStrongBinder());
                o3 o3Var7 = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    zzbpkVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpkVar5 = iInterfaceQueryLocalInterface5 instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface5 : new zzbpk(strongBinder5);
                }
                zzbfn zzbfnVar = (zzbfn) zzaye.zza(parcel, zzbfn.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzaye.zzc(parcel);
                zzz(aVarY6, o3Var7, string10, string11, zzbpkVar5, zzbfnVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 17:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                zzaye.zze(parcel2, bundleZze);
                return true;
            case 18:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                zzaye.zze(parcel2, bundleZzf);
                return true;
            case 19:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzaye.zze(parcel2, bundleZzg);
                return true;
            case 20:
                o3 o3Var8 = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzaye.zzc(parcel);
                zzB(o3Var8, string12, string13);
                parcel2.writeNoException();
                return true;
            case zzbbs.zzt.zzm /* 21 */:
                q7.a aVarY7 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzD(aVarY7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i12 = zzaye.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                q7.a aVarY8 = b.y(parcel.readStrongBinder());
                zzbwu zzbwuVarZzb2 = zzbwt.zzb(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzaye.zzc(parcel);
                zzr(aVarY8, zzbwuVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbgs zzbgsVarZzi = zzi();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbgsVarZzi);
                return true;
            case 25:
                boolean zZzg = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzG(zZzg);
                parcel2.writeNoException();
                return true;
            case 26:
                j2 j2VarZzh = zzh();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, j2VarZzh);
                return true;
            case 27:
                zzbpv zzbpvVarZzk = zzk();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbpvVarZzk);
                return true;
            case 28:
                q7.a aVarY9 = b.y(parcel.readStrongBinder());
                o3 o3Var9 = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    zzbpkVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpkVar6 = iInterfaceQueryLocalInterface6 instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface6 : new zzbpk(strongBinder6);
                }
                zzaye.zzc(parcel);
                zzA(aVarY9, o3Var9, string14, zzbpkVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                q7.a aVarY10 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzK(aVarY10);
                parcel2.writeNoException();
                return true;
            case 31:
                q7.a aVarY11 = b.y(parcel.readStrongBinder());
                zzblt zzbltVarZzb = zzbls.zzb(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzblz.CREATOR);
                zzaye.zzc(parcel);
                zzq(aVarY11, zzbltVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                q7.a aVarY12 = b.y(parcel.readStrongBinder());
                o3 o3Var10 = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    zzbpkVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpkVar7 = iInterfaceQueryLocalInterface7 instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface7 : new zzbpk(strongBinder7);
                }
                zzaye.zzc(parcel);
                zzC(aVarY12, o3Var10, string15, zzbpkVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbru zzbruVarZzl = zzl();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zzbruVarZzl);
                return true;
            case 34:
                zzbru zzbruVarZzm = zzm();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zzbruVarZzm);
                return true;
            case 35:
                q7.a aVarY13 = b.y(parcel.readStrongBinder());
                q3 q3Var3 = (q3) zzaye.zza(parcel, q3.CREATOR);
                o3 o3Var11 = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    zzbpkVar8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpkVar8 = iInterfaceQueryLocalInterface8 instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface8 : new zzbpk(strongBinder8);
                }
                zzaye.zzc(parcel);
                zzw(aVarY13, q3Var3, o3Var11, string16, string17, zzbpkVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbpp zzbppVarZzj = zzj();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbppVarZzj);
                return true;
            case 37:
                q7.a aVarY14 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzJ(aVarY14);
                parcel2.writeNoException();
                return true;
            case 38:
                q7.a aVarY15 = b.y(parcel.readStrongBinder());
                o3 o3Var12 = (o3) zzaye.zza(parcel, o3.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpkVar9 = iInterfaceQueryLocalInterface9 instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface9 : new zzbpk(strongBinder9);
                }
                zzaye.zzc(parcel);
                zzt(aVarY15, o3Var12, string18, zzbpkVar9);
                parcel2.writeNoException();
                return true;
            case 39:
                q7.a aVarY16 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzH(aVarY16);
                parcel2.writeNoException();
                return true;
        }
    }
}
