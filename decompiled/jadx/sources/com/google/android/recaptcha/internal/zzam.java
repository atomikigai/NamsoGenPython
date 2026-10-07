package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import e0.k;
import java.util.UUID;
import jc.i;
import r7.g;
import rc.b0;
import rc.t1;
import yb.d;
import zc.a;
import zc.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzam {
    private static zzaw zzb;
    public static final zzam zza = new zzam();
    private static final String zzc = UUID.randomUUID().toString();
    private static final a zzd = e.a();
    private static final zzt zze = new zzt();
    private static zzg zzf = new zzg(null, 1, 0 == true ? 1 : 0);

    private zzam() {
    }

    public static final Object zzc(Application application, String str, long j4, zzbq zzbqVar, d dVar) throws j, RecaptchaException, t1 {
        return b0.y(zze.zzb().b(), new zzah(application, str, j4, null, null), dVar);
    }

    public static final Task zzd(Application application, String str, long j4) throws j, RecaptchaException, t1 {
        return zzj.zza(b0.d(zze.zzb(), new zzak(application, str, j4, null)));
    }

    public static final zzg zze() {
        return zzf;
    }

    public static final void zzf(zzg zzgVar) {
        zzf = zzgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [zc.a] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ac.c, com.google.android.recaptcha.internal.zzai] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [zc.a] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [zc.a] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object zza(Application application, String str, long j4, zzab zzabVar, WebView webView, zzbq zzbqVar, zzt zztVar, d dVar) throws Throwable {
        ?? zzaiVar;
        zzt zztVar2;
        long j10;
        String str2;
        zzab zzabVar2;
        Application application2;
        ?? r10;
        zzaw zzawVar;
        zzbg zzbgVar;
        ?? r11;
        zzbd zzbdVar;
        ?? r12;
        if (dVar instanceof zzai) {
            zzai zzaiVar2 = (zzai) dVar;
            int i = zzaiVar2.zzg;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzaiVar2.zzg = i - Integer.MIN_VALUE;
                zzaiVar = zzaiVar2;
            } else {
                zzaiVar = new zzai(this, dVar);
            }
        } else {
            zzaiVar = new zzai(this, dVar);
        }
        Object obj = zzaiVar.zze;
        zb.a aVar = zb.a.f11555a;
        int i10 = zzaiVar.zzg;
        try {
            try {
                if (i10 == 0) {
                    g.G(obj);
                    ?? r13 = zzd;
                    zzaiVar.zza = application;
                    zzaiVar.zzb = str;
                    zzaiVar.zzc = zzabVar;
                    zzaiVar.zzi = zztVar;
                    zzaiVar.zzh = r13;
                    zzaiVar.zzd = j4;
                    zzaiVar.zzg = 1;
                    if (r13.c(zzaiVar) != aVar) {
                        zztVar2 = zztVar;
                        j10 = j4;
                        str2 = str;
                        zzabVar2 = zzabVar;
                        application2 = application;
                        r10 = r13;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzbgVar = (zzbg) zzaiVar.zzc;
                    zzbdVar = (zzbd) zzaiVar.zzb;
                    a aVar2 = (a) zzaiVar.zza;
                    try {
                        g.G(obj);
                        r11 = aVar2;
                        zzawVar = (zzaw) obj;
                        zzb = zzawVar;
                        zzbgVar.zza(zzbdVar.zza(zzne.INIT_TOTAL));
                        r12 = r11;
                        r12.d(null);
                        return zzawVar;
                    } catch (RecaptchaException e) {
                        throw e;
                    } catch (Exception unused) {
                        throw new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null);
                    }
                }
                long j11 = zzaiVar.zzd;
                a aVar3 = zzaiVar.zzh;
                zzt zztVar3 = zzaiVar.zzi;
                zzabVar2 = (zzab) zzaiVar.zzc;
                str2 = (String) zzaiVar.zzb;
                Application application3 = (Application) zzaiVar.zza;
                g.G(obj);
                j10 = j11;
                r10 = aVar3;
                zztVar2 = zztVar3;
                application2 = application3;
                String string = UUID.randomUUID().toString();
                zzbd zzbdVar2 = new zzbd(zzc, string, null);
                zzbdVar2.zzc(string);
                Application application4 = application2;
                zzab zzabVar3 = zzabVar2;
                String str3 = str2;
                zzt zztVar4 = zztVar2;
                zzbg zzbgVar2 = new zzbg(str3, application4, zzabVar3, zztVar4, new zzbm(application2, new zzbo(zzabVar2.zzc()), zztVar2.zza()));
                zzne zzneVar = zzne.INIT_TOTAL;
                zzbb zzbbVarZza = zzbdVar2.zza(zzneVar);
                zzbgVar2.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar2.zza, new zzac()));
                if (j10 < 5000) {
                    zzbgVar2.zzb(zzbdVar2.zza(zzneVar), new zzp(zzn.zzm, zzl.zzT, null), null);
                    throw new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
                }
                if (k.checkSelfPermission(application4, "android.permission.INTERNET") != 0) {
                    zzbgVar2.zzb(zzbdVar2.zza(zzneVar), new zzp(zzn.zze, zzl.zzv, null), null);
                    throw new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null);
                }
                zzbq zzbqVar2 = new zzbq(new zzy(application4), zzbgVar2);
                zzawVar = zzb;
                if (zzawVar == null) {
                    zzaiVar.zza = r10;
                    zzaiVar.zzb = zzbdVar2;
                    zzaiVar.zzc = zzbgVar2;
                    zzaiVar.zzi = null;
                    zzaiVar.zzh = null;
                    zzaiVar.zzg = 2;
                    Object objZ = b0.z(j10, new zzaj(application4, zzabVar3, str3, zzbqVar2, zzbdVar2, zztVar4, null, zzbgVar2, j10, null), zzaiVar);
                    if (objZ != aVar) {
                        zzbgVar = zzbgVar2;
                        obj = objZ;
                        r11 = r10;
                        zzbdVar = zzbdVar2;
                        zzawVar = (zzaw) obj;
                        zzb = zzawVar;
                        zzbgVar.zza(zzbdVar.zza(zzne.INIT_TOTAL));
                        r12 = r11;
                    }
                    return aVar;
                }
                if (!i.a(zzawVar.zzg(), str3)) {
                    throw new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, "Only one site key can be used per runtime. The site key you provided " + str3 + " is different than " + zzawVar.zzg());
                }
                zzbgVar2.zza(zzbdVar2.zza(zzneVar));
                r12 = r10;
                r12.d(null);
                return zzawVar;
            } catch (RecaptchaException e4) {
                throw e4;
            } catch (Exception unused2) {
                throw new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null);
            } catch (Throwable th) {
                th = th;
                zzaiVar = r10;
                zzaiVar.d(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
