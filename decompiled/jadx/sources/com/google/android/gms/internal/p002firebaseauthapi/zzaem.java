package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import java.lang.reflect.InvocationTargetException;
import n9.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaem extends zzaff implements zzafw {
    zzaen zza;
    private zzaeg zzb;
    private zzaeh zzc;
    private zzafk zzd;
    private final zzael zze;
    private final g zzf;
    private final String zzg;

    public zzaem(g gVar, zzael zzaelVar, zzafk zzafkVar, zzaeg zzaegVar, zzaeh zzaehVar) {
        this.zzf = gVar;
        gVar.a();
        String str = gVar.f7361c.f7366a;
        this.zzg = str;
        i0.i(zzaelVar);
        this.zze = zzaelVar;
        zzy(null, null, null);
        zzafx.zze(str, this);
    }

    private final zzaen zzx() {
        if (this.zza == null) {
            g gVar = this.zzf;
            String strZzb = this.zze.zzb();
            gVar.a();
            this.zza = new zzaen(gVar.f7359a, gVar, strZzb);
        }
        return this.zza;
    }

    private final void zzy(zzafk zzafkVar, zzaeg zzaegVar, zzaeh zzaehVar) {
        this.zzd = null;
        this.zzb = null;
        this.zzc = null;
        String strZza = zzafu.zza("firebear.secureToken");
        if (TextUtils.isEmpty(strZza)) {
            strZza = zzafx.zzd(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(strZza)));
        }
        if (this.zzd == null) {
            this.zzd = new zzafk(strZza, zzx());
        }
        String strZza2 = zzafu.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza2)) {
            strZza2 = zzafx.zzb(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(strZza2)));
        }
        if (this.zzb == null) {
            this.zzb = new zzaeg(strZza2, zzx());
        }
        String strZza3 = zzafu.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strZza3)) {
            strZza3 = zzafx.zzc(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(strZza3)));
        }
        if (this.zzc == null) {
            this.zzc = new zzaeh(strZza3, zzx());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zza(zzagb zzagbVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzagbVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/createAuthUri", this.zzg), zzagbVar, zzafeVar, zzagc.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb(zzagd zzagdVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzagdVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/deleteAccount", this.zzg), zzagdVar, zzafeVar, Void.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzc(zzage zzageVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzageVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/emailLinkSignin", this.zzg), zzageVar, zzafeVar, zzagf.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzd(zzagg zzaggVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzaggVar);
        i0.i(zzafeVar);
        zzaeh zzaehVar = this.zzc;
        zzafh.zzb(zzaehVar.zza("/accounts/mfaEnrollment:finalize", this.zzg), zzaggVar, zzafeVar, zzagh.class, zzaehVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zze(zzagi zzagiVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzagiVar);
        i0.i(zzafeVar);
        zzaeh zzaehVar = this.zzc;
        zzafh.zzb(zzaehVar.zza("/accounts/mfaSignIn:finalize", this.zzg), zzagiVar, zzafeVar, zzagj.class, zzaehVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzf(zzagp zzagpVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzagpVar);
        i0.i(zzafeVar);
        zzafk zzafkVar = this.zzd;
        zzafh.zzb(zzafkVar.zza("/token", this.zzg), zzagpVar, zzafeVar, zzahb.class, zzafkVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzg(zzagq zzagqVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzagqVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/getAccountInfo", this.zzg), zzagqVar, zzafeVar, zzagr.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzh(zzagu zzaguVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzaguVar);
        i0.i(zzafeVar);
        if (zzaguVar.zzb() != null) {
            zzx().zzc(zzaguVar.zzb().f9222s);
        }
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/getOobConfirmationCode", this.zzg), zzaguVar, zzafeVar, zzagv.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzi(zzagw zzagwVar, zzafe zzafeVar) {
        i0.i(zzagwVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zza(zzaegVar.zza("/getRecaptchaParam", this.zzg), zzafeVar, zzagx.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzj(zzagz zzagzVar, zzafe zzafeVar) {
        i0.i(zzagzVar);
        i0.i(zzafeVar);
        zzaeh zzaehVar = this.zzc;
        zzafh.zza(zzaehVar.zza("/recaptchaConfig", this.zzg) + "&clientType=" + zzagzVar.zzc() + "&version=" + zzagzVar.zzd(), zzafeVar, zzaha.class, zzaehVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafw
    public final void zzk() {
        zzy(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzl(zzahj zzahjVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzahjVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/resetPassword", this.zzg), zzahjVar, zzafeVar, zzahk.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzm(zzahl zzahlVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzahlVar);
        i0.i(zzafeVar);
        if (!TextUtils.isEmpty(zzahlVar.zzc())) {
            zzx().zzc(zzahlVar.zzc());
        }
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/sendVerificationCode", this.zzg), zzahlVar, zzafeVar, zzahm.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzn(zzahn zzahnVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzahnVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/setAccountInfo", this.zzg), zzahnVar, zzafeVar, zzaho.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzo(String str, zzafe zzafeVar) {
        i0.i(zzafeVar);
        zzx().zzb(str);
        ((zzabq) zzafeVar).zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzp(zzahp zzahpVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzahpVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/signupNewUser", this.zzg), zzahpVar, zzafeVar, zzahq.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzq(zzahr zzahrVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzahrVar);
        i0.i(zzafeVar);
        if (zzahrVar instanceof zzahv) {
            zzahv zzahvVar = (zzahv) zzahrVar;
            if (!TextUtils.isEmpty(zzahvVar.zzc())) {
                zzx().zzc(zzahvVar.zzc());
            }
        }
        zzaeh zzaehVar = this.zzc;
        zzafh.zzb(zzaehVar.zza("/accounts/mfaEnrollment:start", this.zzg), zzahrVar, zzafeVar, zzahs.class, zzaehVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzr(zzaht zzahtVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzahtVar);
        i0.i(zzafeVar);
        if (!TextUtils.isEmpty(zzahtVar.zzc())) {
            zzx().zzc(zzahtVar.zzc());
        }
        zzaeh zzaehVar = this.zzc;
        zzafh.zzb(zzaehVar.zza("/accounts/mfaSignIn:start", this.zzg), zzahtVar, zzafeVar, zzahu.class, zzaehVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzs(zzaic zzaicVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzaicVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/verifyAssertion", this.zzg), zzaicVar, zzafeVar, zzaie.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzt(zzaif zzaifVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzaifVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/verifyCustomToken", this.zzg), zzaifVar, zzafeVar, zzaig.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzu(zzaih zzaihVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzaihVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/verifyPassword", this.zzg), zzaihVar, zzafeVar, zzaii.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzv(zzaij zzaijVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzaijVar);
        i0.i(zzafeVar);
        zzaeg zzaegVar = this.zzb;
        zzafh.zzb(zzaegVar.zza("/verifyPhoneNumber", this.zzg), zzaijVar, zzafeVar, zzaik.class, zzaegVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzw(zzail zzailVar, zzafe zzafeVar) throws IllegalAccessException, InvocationTargetException {
        i0.i(zzailVar);
        i0.i(zzafeVar);
        zzaeh zzaehVar = this.zzc;
        zzafh.zzb(zzaehVar.zza("/accounts/mfaEnrollment:withdraw", this.zzg), zzailVar, zzafeVar, zzaim.class, zzaehVar.zzb);
    }
}
