package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import d6.p;
import e6.t;
import h6.r0;
import i6.h;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdfj extends zzcrq {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzddp zze;
    private final zzdgv zzf;
    private final zzcsl zzg;
    private final zzfqa zzh;
    private final zzcwz zzi;
    private final zzcad zzj;
    private boolean zzk;

    public zzdfj(zzcrp zzcrpVar, Context context, zzcfk zzcfkVar, zzddp zzddpVar, zzdgv zzdgvVar, zzcsl zzcslVar, zzfqa zzfqaVar, zzcwz zzcwzVar, zzcad zzcadVar) {
        super(zzcrpVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcfkVar);
        this.zze = zzddpVar;
        this.zzf = zzdgvVar;
        this.zzg = zzcslVar;
        this.zzh = zzfqaVar;
        this.zzi = zzcwzVar;
        this.zzj = zzcadVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfk zzcfkVar = (zzcfk) this.zzd.get();
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgB)).booleanValue()) {
                if (!this.zzk && zzcfkVar != null) {
                    zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdfi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfkVar.destroy();
                        }
                    });
                }
            } else if (zzcfkVar != null) {
                zzcfkVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zzc(boolean z4, Activity activity) {
        Context context;
        zzfet zzfetVarZzD;
        this.zze.zzb();
        zzbce zzbceVar = zzbcn.zzaJ;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            r0 r0Var = p.C.f2979c;
            if (r0.e(this.zzc)) {
                h.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzaK)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
            } else {
                zzcfk zzcfkVar = (zzcfk) this.zzd.get();
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzlC)).booleanValue() || zzcfkVar == null || (zzfetVarZzD = zzcfkVar.zzD()) == null || !zzfetVarZzD.zzar || zzfetVarZzD.zzas == this.zzj.zzb()) {
                    if (this.zzk) {
                        h.g("The interstitial ad has been shown.");
                        this.zzi.zza(zzfgq.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzk) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        try {
                            this.zzf.zza(z4, context, this.zzi);
                            this.zze.zza();
                            this.zzk = true;
                            return true;
                        } catch (zzdgu e) {
                            this.zzi.zzc(e);
                        }
                    }
                } else {
                    h.g("The interstitial consent form has been shown.");
                    this.zzi.zza(zzfgq.zzd(12, "The consent form has already been shown.", null));
                }
            }
        } else {
            zzcfk zzcfkVar2 = (zzcfk) this.zzd.get();
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzlC)).booleanValue()) {
                if (this.zzk) {
                    h.g("The interstitial ad has been shown.");
                    this.zzi.zza(zzfgq.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzk) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    this.zzf.zza(z4, context, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                }
            } else {
                if (this.zzk) {
                    h.g("The interstitial ad has been shown.");
                    this.zzi.zza(zzfgq.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzk) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    this.zzf.zza(z4, context, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                }
            }
        }
        return false;
    }
}
