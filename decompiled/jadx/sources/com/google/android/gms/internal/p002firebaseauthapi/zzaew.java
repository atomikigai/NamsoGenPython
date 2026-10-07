package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import qd.b;
import v9.d;
import v9.t;
import w9.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaew implements zzadw {
    final /* synthetic */ zzaez zza;

    public zzaew(zzaez zzaezVar) {
        this.zza = zzaezVar;
    }

    private final void zzs(zzaex zzaexVar) {
        this.zza.zzm.execute(new zzaev(this, zzaexVar));
    }

    private final void zzt(Status status, d dVar, String str, String str2) {
        zzaez.zzk(this.zza, status);
        zzaez zzaezVar = this.zza;
        zzaezVar.zzt = dVar;
        zzaezVar.zzu = str;
        zzaezVar.zzv = str2;
        g gVar = zzaezVar.zzj;
        if (gVar != null) {
            gVar.zzb(status);
        }
        this.zza.zzl(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zza(String str) throws RemoteException {
        i0.k(zzabz.zzO(this, "Unexpected response type "), this.zza.zze == 8);
        zzaez zzaezVar = this.zza;
        zzaezVar.zzs = str;
        zzaezVar.zza = true;
        zzs(new zzaet(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzb(String str) throws RemoteException {
        i0.k(zzabz.zzO(this, "Unexpected response type "), this.zza.zze == 8);
        this.zza.zzs = str;
        zzs(new zzaer(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzc(zzagc zzagcVar) throws RemoteException {
        i0.k(zzabz.zzO(this, "Unexpected response type "), this.zza.zze == 3);
        zzaez zzaezVar = this.zza;
        zzaezVar.zzp = zzagcVar;
        zzaez.zzj(zzaezVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzd() throws RemoteException {
        i0.k(zzabz.zzO(this, "Unexpected response type "), this.zza.zze == 5);
        zzaez.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zze(zzaae zzaaeVar) {
        zzt(zzaaeVar.zza(), zzaaeVar.zzb(), zzaaeVar.zzc(), zzaaeVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzf(zzaaf zzaafVar) {
        zzaez zzaezVar = this.zza;
        zzaezVar.zzw = zzaafVar;
        zzaezVar.zzl(b.G("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzg(Status status, t tVar) throws RemoteException {
        StringBuilder sb2 = new StringBuilder("Unexpected response type ");
        int i = this.zza.zze;
        sb2.append(i);
        i0.k(sb2.toString(), i == 2);
        zzt(status, tVar, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzh(Status status) throws RemoteException {
        String str = status.f2046b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null, null, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null, null, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null, null, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null, null, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null, null, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null, null, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null, null, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null, null, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null, null, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null, null, null);
            }
        }
        zzaez zzaezVar = this.zza;
        if (zzaezVar.zze == 8) {
            zzaezVar.zza = true;
            zzs(new zzaeu(this, status));
        } else {
            zzaez.zzk(zzaezVar, status);
            this.zza.zzl(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzi(zzagx zzagxVar) throws RemoteException {
        zzaez zzaezVar = this.zza;
        zzaezVar.zzy = zzagxVar;
        zzaez.zzj(zzaezVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzj(zzaha zzahaVar) throws RemoteException {
        zzaez zzaezVar = this.zza;
        zzaezVar.zzx = zzahaVar;
        zzaez.zzj(zzaezVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzk(zzahb zzahbVar, zzags zzagsVar) throws RemoteException {
        i0.k(zzabz.zzO(this, "Unexpected response type: "), this.zza.zze == 2);
        zzaez zzaezVar = this.zza;
        zzaezVar.zzn = zzahbVar;
        zzaezVar.zzo = zzagsVar;
        zzaez.zzj(zzaezVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzl(zzahk zzahkVar) throws RemoteException {
        i0.k(zzabz.zzO(this, "Unexpected response type "), this.zza.zze == 4);
        zzaez zzaezVar = this.zza;
        zzaezVar.zzq = zzahkVar;
        zzaez.zzj(zzaezVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzm() throws RemoteException {
        i0.k(zzabz.zzO(this, "Unexpected response type "), this.zza.zze == 6);
        zzaez.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzn(String str) throws RemoteException {
        i0.k(zzabz.zzO(this, "Unexpected response type "), this.zza.zze == 7);
        zzaez zzaezVar = this.zza;
        zzaezVar.zzr = str;
        zzaez.zzj(zzaezVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzo() throws RemoteException {
        i0.k(zzabz.zzO(this, "Unexpected response type "), this.zza.zze == 9);
        zzaez.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzp(zzahs zzahsVar) throws RemoteException {
        zzaez zzaezVar = this.zza;
        zzaezVar.zzz = zzahsVar;
        zzaez.zzj(zzaezVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzq(zzahb zzahbVar) throws RemoteException {
        i0.k(zzabz.zzO(this, "Unexpected response type: "), this.zza.zze == 1);
        zzaez zzaezVar = this.zza;
        zzaezVar.zzn = zzahbVar;
        zzaez.zzj(zzaezVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zzr(t tVar) throws RemoteException {
        i0.k(zzabz.zzO(this, "Unexpected response type "), this.zza.zze == 8);
        this.zza.zza = true;
        zzs(new zzaes(this, tVar));
    }
}
