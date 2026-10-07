package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import jc.i;
import pc.f;
import r7.g;
import rc.b0;
import ub.h;
import vb.k;
import vb.t;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaw implements RecaptchaClient, RecaptchaTasksClient {
    public static final zzan zza = new zzan(null);
    private static final f zzb = new f("^[a-zA-Z0-9/_]{0,100}$");
    private final Application zzc;
    private final zzg zzd;
    private final String zze;
    private final zzab zzf;
    private final zzoe zzg;
    private final zzbd zzh;
    private final zzbg zzi;
    private final zzq zzj;
    private final zzbs zzk;
    private final zzt zzl;

    public zzaw(Application application, zzg zzgVar, String str, zzt zztVar, zzab zzabVar, zzoe zzoeVar, zzbd zzbdVar, zzbg zzbgVar, zzq zzqVar, zzbs zzbsVar) {
        this.zzc = application;
        this.zzd = zzgVar;
        this.zze = str;
        this.zzl = zztVar;
        this.zzf = zzabVar;
        this.zzg = zzoeVar;
        this.zzh = zzbdVar;
        this.zzi = zzbgVar;
        this.zzj = zzqVar;
        this.zzk = zzbsVar;
    }

    public static final void zzi(zzaw zzawVar, long j4, RecaptchaAction recaptchaAction, zzbd zzbdVar) throws zzp {
        zzbb zzbbVarZza = zzbdVar.zza(zzne.EXECUTE_NATIVE);
        zzbg zzbgVar = zzawVar.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        f fVar = zzb;
        String action = recaptchaAction.getAction();
        fVar.getClass();
        i.e(action, "input");
        zzp zzpVar = !fVar.f7863a.matcher(action).matches() ? new zzp(zzn.zzi, zzl.zzq, null) : null;
        if (j4 < 5000) {
            zzpVar = new zzp(zzn.zzc, zzl.zzT, null);
        }
        if (zzpVar == null) {
            zzawVar.zzi.zza(zzbbVarZza);
        } else {
            zzawVar.zzi.zzb(zzbbVarZza, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzj(long j4, String str, zzbd zzbdVar, d dVar) throws zzp {
        zzao zzaoVar;
        Exception e;
        zzaw zzawVar;
        zzbb zzbbVar;
        zzp zzpVar;
        if (dVar instanceof zzao) {
            zzaoVar = (zzao) dVar;
            int i = zzaoVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzaoVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzaoVar = new zzao(this, dVar);
            }
        } else {
            zzaoVar = new zzao(this, dVar);
        }
        Object objZza = zzaoVar.zza;
        a aVar = a.f11555a;
        int i10 = zzaoVar.zzc;
        if (i10 == 0) {
            g.G(objZza);
            zzbb zzbbVarZza = zzbdVar.zza(zzne.COLLECT_SIGNALS);
            zzbg zzbgVar = this.zzi;
            zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
            try {
                zzg zzgVar = this.zzd;
                zzaoVar.zzd = this;
                zzaoVar.zze = zzbbVarZza;
                zzaoVar.zzc = 1;
                objZza = zzgVar.zza(str, j4, zzaoVar);
                if (objZza == aVar) {
                    return aVar;
                }
                zzawVar = this;
                zzbbVar = zzbbVarZza;
            } catch (Exception e4) {
                e = e4;
                zzawVar = this;
                zzbbVar = zzbbVarZza;
                if (e instanceof zzp) {
                    zzpVar = (zzp) e;
                } else {
                    zzpVar = new zzp(zzn.zzc, zzl.zzan, null);
                }
                zzawVar.zzi.zzb(zzbbVar, zzpVar, null);
                throw zzpVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbbVar = zzaoVar.zze;
            zzawVar = zzaoVar.zzd;
            try {
                g.G(objZza);
            } catch (Exception e10) {
                e = e10;
                if (e instanceof zzp) {
                    zzpVar = (zzp) e;
                } else {
                    zzpVar = new zzp(zzn.zzc, zzl.zzan, null);
                }
                zzawVar.zzi.zzb(zzbbVar, zzpVar, null);
                throw zzpVar;
            }
        }
        zzog zzogVar = (zzog) objZza;
        zzawVar.zzi.zza(zzbbVar);
        return zzogVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object zzk(RecaptchaAction recaptchaAction, long j4, d dVar) throws Throwable {
        zzas zzasVar;
        zzaw zzawVar;
        zzbd zzbdVar;
        zzp zzpVar;
        if (dVar instanceof zzas) {
            zzasVar = (zzas) dVar;
            int i = zzasVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzasVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzasVar = new zzas(this, dVar);
            }
        } else {
            zzasVar = new zzas(this, dVar);
        }
        zzas zzasVar2 = zzasVar;
        Object objZ = zzasVar2.zza;
        a aVar = a.f11555a;
        int i10 = zzasVar2.zzc;
        if (i10 == 0) {
            g.G(objZ);
            String string = UUID.randomUUID().toString();
            zzbd zzbdVarZzb = this.zzh.zzb();
            zzbdVarZzb.zzc(string);
            zzbg zzbgVar = this.zzi;
            zzbb zzbbVarZza = zzbdVarZzb.zza(zzne.EXECUTE_TOTAL);
            zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
            try {
                zzat zzatVar = new zzat(this, j4, recaptchaAction, zzbdVarZzb, string, null);
                zzasVar2.zzd = this;
                zzasVar2.zze = zzbdVarZzb;
                zzasVar2.zzc = 1;
                objZ = b0.z(j4, zzatVar, zzasVar2);
                if (objZ == aVar) {
                    return aVar;
                }
                zzawVar = this;
                zzbdVar = zzbdVarZzb;
            } catch (Exception e) {
                e = e;
                zzawVar = this;
                zzbdVar = zzbdVarZzb;
                if (e instanceof zzp) {
                    zzpVar = (zzp) e;
                } else {
                    zzpVar = new zzp(zzn.zzc, zzl.zzaj, e.getClass().getSimpleName());
                }
                zzawVar.zzi.zzb(zzbdVar.zza(zzne.EXECUTE_TOTAL), zzpVar, null);
                return g.m(zzpVar.zzc());
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbdVar = zzasVar2.zze;
            zzawVar = zzasVar2.zzd;
            try {
                g.G(objZ);
            } catch (Exception e4) {
                e = e4;
                if (e instanceof zzp) {
                    zzpVar = (zzp) e;
                } else {
                    zzpVar = new zzp(zzn.zzc, zzl.zzaj, e.getClass().getSimpleName());
                }
                zzawVar.zzi.zzb(zzbdVar.zza(zzne.EXECUTE_TOTAL), zzpVar, null);
                return g.m(zzpVar.zzc());
            }
        }
        return ((h) objZ).f9068a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(zzol zzolVar, zzbd zzbdVar) throws zzp {
        zzbb zzbbVarZza = zzbdVar.zza(zzne.POST_EXECUTE);
        zzbg zzbgVar = this.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        try {
            List<zzon> listZzj = zzolVar.zzj();
            int iA = t.A(k.U(listZzj));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (zzon zzonVar : listZzj) {
                linkedHashMap.put(zzonVar.zzg(), zzonVar.zzi());
            }
            this.zzj.zzb(linkedHashMap);
            this.zzi.zza(zzbbVarZza);
        } catch (Exception e) {
            zzp zzpVar = e instanceof zzp ? (zzp) e : new zzp(zzn.zzc, zzl.zzan, null);
            this.zzi.zzb(zzbbVarZza, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    public final Object mo2execute0E7RQCE(RecaptchaAction recaptchaAction, long j4, d dVar) {
        zzap zzapVar;
        if (dVar instanceof zzap) {
            zzapVar = (zzap) dVar;
            int i = zzapVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzapVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzapVar = new zzap(this, dVar);
            }
        } else {
            zzapVar = new zzap(this, dVar);
        }
        Object objY = zzapVar.zza;
        a aVar = a.f11555a;
        int i10 = zzapVar.zzc;
        if (i10 == 0) {
            g.G(objY);
            yb.i iVarB = this.zzl.zzb().b();
            zzaq zzaqVar = new zzaq(this, recaptchaAction, j4, null);
            zzapVar.zzc = 1;
            objY = b0.y(iVarB, zzaqVar, zzapVar);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.G(objY);
        }
        return ((h) objY).f9068a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    public final Object mo3executegIAlus(RecaptchaAction recaptchaAction, d dVar) {
        zzar zzarVar;
        if (dVar instanceof zzar) {
            zzarVar = (zzar) dVar;
            int i = zzarVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzarVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzarVar = new zzar(this, dVar);
            }
        } else {
            zzarVar = new zzar(this, dVar);
        }
        Object obj = zzarVar.zza;
        Object obj2 = a.f11555a;
        int i10 = zzarVar.zzc;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.G(obj);
            return ((h) obj).f9068a;
        }
        g.G(obj);
        zzarVar.zzc = 1;
        Object objMo2execute0E7RQCE = mo2execute0E7RQCE(recaptchaAction, 10000L, zzarVar);
        return objMo2execute0E7RQCE == obj2 ? obj2 : objMo2execute0E7RQCE;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzj.zza(b0.d(this.zzl.zzb(), new zzau(this, recaptchaAction, 10000L, null)));
    }

    public final String zzg() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j4) {
        return zzj.zza(b0.d(this.zzl.zzb(), new zzau(this, recaptchaAction, j4, null)));
    }
}
