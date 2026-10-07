package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbpf;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbtg;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzchk;
import com.google.android.gms.internal.ads.zzdjs;
import com.google.android.gms.internal.ads.zzdju;
import com.google.android.gms.internal.ads.zzdtv;
import com.google.android.gms.internal.ads.zzelv;
import com.google.android.gms.internal.ads.zzezt;
import com.google.android.gms.internal.ads.zzfbh;
import com.google.android.gms.internal.ads.zzfcy;
import com.google.android.gms.internal.ads.zzfem;
import com.google.android.gms.internal.ads.zzfeq;
import d6.o;
import e6.b1;
import e6.b2;
import e6.i0;
import e6.k1;
import e6.m0;
import e6.q3;
import e6.v0;
import g6.d;
import java.util.HashMap;
import q7.a;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends zzayd implements b1 {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // e6.b1
    public final zzbxc A(a aVar, String str, zzbpg zzbpgVar, int i) {
        Context context = (Context) b.I(aVar);
        zzfem zzfemVarZzw = zzchk.zzb(context, zzbpgVar, i).zzw();
        zzfemVarZzw.zzb(context);
        zzfemVarZzw.zza(str);
        return zzfemVarZzw.zzc().zza();
    }

    @Override // e6.b1
    public final m0 D(a aVar, q3 q3Var, String str, zzbpg zzbpgVar, int i) {
        Context context = (Context) b.I(aVar);
        zzezt zzeztVarZzt = zzchk.zzb(context, zzbpgVar, i).zzt();
        zzeztVarZzt.zza(str);
        zzeztVarZzt.zzb(context);
        return zzeztVarZzt.zzc().zza();
    }

    @Override // e6.b1
    public final i0 E(a aVar, String str, zzbpg zzbpgVar, int i) {
        Context context = (Context) b.I(aVar);
        return new zzelv(zzchk.zzb(context, zzbpgVar, i), context, str);
    }

    @Override // e6.b1
    public final zzbgc G(a aVar, a aVar2) {
        return new zzdju((FrameLayout) b.I(aVar), (FrameLayout) b.I(aVar2), 243799000);
    }

    @Override // e6.b1
    public final zzbkt b(a aVar, zzbpg zzbpgVar, int i, zzbkq zzbkqVar) {
        Context context = (Context) b.I(aVar);
        zzdtv zzdtvVarZzk = zzchk.zzb(context, zzbpgVar, i).zzk();
        zzdtvVarZzk.zzb(context);
        zzdtvVarZzk.zza(zzbkqVar);
        return zzdtvVarZzk.zzc().zzd();
    }

    @Override // e6.b1
    public final zzbsz d(a aVar, zzbpg zzbpgVar, int i) {
        return zzchk.zzb((Context) b.I(aVar), zzbpgVar, i).zzn();
    }

    @Override // e6.b1
    public final v0 n(a aVar, zzbpg zzbpgVar, int i) {
        return zzchk.zzb((Context) b.I(aVar), zzbpgVar, i).zzA();
    }

    @Override // e6.b1
    public final k1 p(a aVar, int i) {
        return zzchk.zzb((Context) b.I(aVar), null, i).zzc();
    }

    @Override // e6.b1
    public final zzbzh t(a aVar, zzbpg zzbpgVar, int i) {
        return zzchk.zzb((Context) b.I(aVar), zzbpgVar, i).zzq();
    }

    @Override // e6.b1
    public final m0 u(a aVar, q3 q3Var, String str, zzbpg zzbpgVar, int i) {
        Context context = (Context) b.I(aVar);
        zzfcy zzfcyVarZzv = zzchk.zzb(context, zzbpgVar, i).zzv();
        zzfcyVarZzv.zzc(context);
        zzfcyVarZzv.zza(q3Var);
        zzfcyVarZzv.zzb(str);
        return zzfcyVarZzv.zzd().zza();
    }

    @Override // e6.b1
    public final m0 v(a aVar, q3 q3Var, String str, int i) {
        return new o((Context) b.I(aVar), q3Var, str, new i6.a(243799000, i, 0, true, false));
    }

    @Override // e6.b1
    public final b2 w(a aVar, zzbpg zzbpgVar, int i) {
        return zzchk.zzb((Context) b.I(aVar), zzbpgVar, i).zzm();
    }

    @Override // e6.b1
    public final m0 x(a aVar, q3 q3Var, String str, zzbpg zzbpgVar, int i) {
        Context context = (Context) b.I(aVar);
        zzfbh zzfbhVarZzu = zzchk.zzb(context, zzbpgVar, i).zzu();
        zzfbhVarZzu.zzc(context);
        zzfbhVarZzu.zza(q3Var);
        zzfbhVarZzu.zzb(str);
        return zzfbhVarZzu.zzd().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) {
        switch (i) {
            case 1:
                a aVarY = b.y(parcel.readStrongBinder());
                q3 q3Var = (q3) zzaye.zza(parcel, q3.CREATOR);
                String string = parcel.readString();
                zzbpg zzbpgVarZzf = zzbpf.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzaye.zzc(parcel);
                m0 m0VarX = x(aVarY, q3Var, string, zzbpgVarZzf, i11);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, m0VarX);
                return true;
            case 2:
                a aVarY2 = b.y(parcel.readStrongBinder());
                q3 q3Var2 = (q3) zzaye.zza(parcel, q3.CREATOR);
                String string2 = parcel.readString();
                zzbpg zzbpgVarZzf2 = zzbpf.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzaye.zzc(parcel);
                m0 m0VarU = u(aVarY2, q3Var2, string2, zzbpgVarZzf2, i12);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, m0VarU);
                return true;
            case 3:
                a aVarY3 = b.y(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbpg zzbpgVarZzf3 = zzbpf.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzaye.zzc(parcel);
                i0 i0VarE = E(aVarY3, string3, zzbpgVarZzf3, i13);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, i0VarE);
                return true;
            case 4:
                b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 5:
                a aVarY4 = b.y(parcel.readStrongBinder());
                a aVarY5 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzbgc zzbgcVarG = G(aVarY4, aVarY5);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbgcVarG);
                return true;
            case 6:
                a aVarY6 = b.y(parcel.readStrongBinder());
                zzbpg zzbpgVarZzf4 = zzbpf.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzaye.zzc(parcel);
                Context context = (Context) b.I(aVarY6);
                zzfem zzfemVarZzw = zzchk.zzb(context, zzbpgVarZzf4, i14).zzw();
                zzfemVarZzw.zzb(context);
                zzfeq zzfeqVarZzb = zzfemVarZzw.zzc().zzb();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzfeqVarZzb);
                return true;
            case 7:
                b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 8:
                a aVarY7 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzbtg zzbtgVarZzn = zzn(aVarY7);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbtgVarZzn);
                return true;
            case 9:
                a aVarY8 = b.y(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzaye.zzc(parcel);
                k1 k1VarP = p(aVarY8, i15);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, k1VarP);
                return true;
            case 10:
                a aVarY9 = b.y(parcel.readStrongBinder());
                q3 q3Var3 = (q3) zzaye.zza(parcel, q3.CREATOR);
                String string4 = parcel.readString();
                int i16 = parcel.readInt();
                zzaye.zzc(parcel);
                m0 m0VarV = v(aVarY9, q3Var3, string4, i16);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, m0VarV);
                return true;
            case 11:
                a aVarY10 = b.y(parcel.readStrongBinder());
                a aVarY11 = b.y(parcel.readStrongBinder());
                a aVarY12 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzdjs zzdjsVar = new zzdjs((View) b.I(aVarY10), (HashMap) b.I(aVarY11), (HashMap) b.I(aVarY12));
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzdjsVar);
                return true;
            case 12:
                a aVarY13 = b.y(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbpg zzbpgVarZzf5 = zzbpf.zzf(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                zzaye.zzc(parcel);
                zzbxc zzbxcVarA = A(aVarY13, string5, zzbpgVarZzf5, i17);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbxcVarA);
                return true;
            case 13:
                a aVarY14 = b.y(parcel.readStrongBinder());
                q3 q3Var4 = (q3) zzaye.zza(parcel, q3.CREATOR);
                String string6 = parcel.readString();
                zzbpg zzbpgVarZzf6 = zzbpf.zzf(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                zzaye.zzc(parcel);
                m0 m0VarD = D(aVarY14, q3Var4, string6, zzbpgVarZzf6, i18);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, m0VarD);
                return true;
            case 14:
                a aVarY15 = b.y(parcel.readStrongBinder());
                zzbpg zzbpgVarZzf7 = zzbpf.zzf(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                zzaye.zzc(parcel);
                zzbzh zzbzhVarT = t(aVarY15, zzbpgVarZzf7, i19);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbzhVarT);
                return true;
            case 15:
                a aVarY16 = b.y(parcel.readStrongBinder());
                zzbpg zzbpgVarZzf8 = zzbpf.zzf(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                zzaye.zzc(parcel);
                zzbsz zzbszVarD = d(aVarY16, zzbpgVarZzf8, i20);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbszVarD);
                return true;
            case 16:
                a aVarY17 = b.y(parcel.readStrongBinder());
                zzbpg zzbpgVarZzf9 = zzbpf.zzf(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                zzbkq zzbkqVarZzc = zzbkp.zzc(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzbkt zzbktVarB = b(aVarY17, zzbpgVarZzf9, i21, zzbkqVarZzc);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbktVarB);
                return true;
            case 17:
                a aVarY18 = b.y(parcel.readStrongBinder());
                zzbpg zzbpgVarZzf10 = zzbpf.zzf(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                zzaye.zzc(parcel);
                b2 b2VarW = w(aVarY18, zzbpgVarZzf10, i22);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, b2VarW);
                return true;
            case 18:
                a aVarY19 = b.y(parcel.readStrongBinder());
                zzbpg zzbpgVarZzf11 = zzbpf.zzf(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                zzaye.zzc(parcel);
                v0 v0VarN = n(aVarY19, zzbpgVarZzf11, i23);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, v0VarN);
                return true;
            default:
                return false;
        }
    }

    @Override // e6.b1
    public final zzbtg zzn(a aVar) {
        Activity activity = (Activity) b.I(aVar);
        AdOverlayInfoParcel adOverlayInfoParcelG = AdOverlayInfoParcel.g(activity.getIntent());
        if (adOverlayInfoParcelG == null) {
            return new d(activity, 4);
        }
        int i = adOverlayInfoParcelG.f1972v;
        if (i == 1) {
            return new d(activity, 3);
        }
        if (i == 2) {
            return new d(activity, 1);
        }
        if (i == 3) {
            return new d(activity, 2);
        }
        if (i != 4) {
            return i != 5 ? new d(activity, 4) : new d(activity, 0);
        }
        return new g6.b(activity, adOverlayInfoParcelG);
    }
}
