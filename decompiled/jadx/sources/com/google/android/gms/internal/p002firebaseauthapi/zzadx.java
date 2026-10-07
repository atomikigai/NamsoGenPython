package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import j7.a;
import v9.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzadx {
    private final zzadw zza;
    private final a zzb;

    public zzadx(zzadw zzadwVar, a aVar) {
        i0.i(zzadwVar);
        this.zza = zzadwVar;
        i0.i(aVar);
        this.zzb = aVar;
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending auto retrieval timeout response.", e, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending send verification code response.", e, new Object[0]);
        }
    }

    public final void zzc(zzagc zzagcVar) {
        try {
            this.zza.zzc(zzagcVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending create auth uri response.", e, new Object[0]);
        }
    }

    public final void zzd() {
        try {
            this.zza.zzd();
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending delete account response.", e, new Object[0]);
        }
    }

    public final void zze(zzaae zzaaeVar) {
        try {
            this.zza.zze(zzaaeVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending failure result with credential", e, new Object[0]);
        }
    }

    public final void zzf(zzaaf zzaafVar) {
        try {
            this.zza.zzf(zzaafVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    public final void zzg(Status status, t tVar) {
        try {
            this.zza.zzg(status, tVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    public void zzh(Status status) {
        try {
            this.zza.zzh(status);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    public final void zzi(zzagx zzagxVar) {
        try {
            this.zza.zzi(zzagxVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending Play Integrity Producer project response.", e, new Object[0]);
        }
    }

    public final void zzj(zzaha zzahaVar) {
        try {
            this.zza.zzj(zzahaVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending get recaptcha config response.", e, new Object[0]);
        }
    }

    public final void zzk(zzahb zzahbVar, zzags zzagsVar) {
        try {
            this.zza.zzk(zzahbVar, zzagsVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    public final void zzl(zzahk zzahkVar) {
        try {
            this.zza.zzl(zzahkVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending password reset response.", e, new Object[0]);
        }
    }

    public final void zzm() {
        try {
            this.zza.zzm();
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending email verification response.", e, new Object[0]);
        }
    }

    public final void zzn(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending set account info response.", e, new Object[0]);
        }
    }

    public final void zzo() {
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when setting FirebaseUI Version", e, new Object[0]);
        }
    }

    public final void zzp(zzahs zzahsVar) {
        try {
            this.zza.zzp(zzahsVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending start mfa enrollment response.", e, new Object[0]);
        }
    }

    public final void zzq(zzahb zzahbVar) {
        try {
            this.zza.zzq(zzahbVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending token result.", e, new Object[0]);
        }
    }

    public final void zzr(t tVar) {
        try {
            this.zza.zzr(tVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending verification completed response.", e, new Object[0]);
        }
    }

    public zzadx(zzadx zzadxVar) {
        this(zzadxVar.zza, zzadxVar.zzb);
    }
}
