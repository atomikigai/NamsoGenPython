package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfpb implements zzfoc {
    private static final zzfpb zza = new zzfpb();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfox();
    private static final Runnable zze = new zzfoy();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfou zzk = new zzfou();
    private final zzfoe zzj = new zzfoe();
    private final zzfov zzl = new zzfov(new zzfpe());

    public static zzfpb zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfpb zzfpbVar) {
        zzfpb zzfpbVar2;
        zzfpbVar.zzg = 0;
        zzfpbVar.zzi.clear();
        zzfpbVar.zzh = false;
        for (zzfna zzfnaVar : zzfnr.zza().zzb()) {
        }
        zzfpbVar.zzm = System.nanoTime();
        zzfpbVar.zzk.zzi();
        long jNanoTime = System.nanoTime();
        zzfod zzfodVarZza = zzfpbVar.zzj.zza();
        if (zzfpbVar.zzk.zze().size() > 0) {
            for (String str : zzfpbVar.zzk.zze()) {
                JSONObject jSONObjectZza = zzfodVarZza.zza(null);
                View viewZza = zzfpbVar.zzk.zza(str);
                zzfod zzfodVarZzb = zzfpbVar.zzj.zzb();
                String strZzc = zzfpbVar.zzk.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfodVarZzb.zza(viewZza);
                    zzfon.zzb(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e) {
                        zzfoo.zza("Error with setting not visible reason", e);
                    }
                    zzfon.zzc(jSONObjectZza, jSONObjectZza2);
                }
                zzfon.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfpbVar.zzl.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (zzfpbVar.zzk.zzf().size() > 0) {
            JSONObject jSONObjectZza3 = zzfodVarZza.zza(null);
            zzfpbVar2 = zzfpbVar;
            zzfpbVar2.zzk(null, zzfodVarZza, jSONObjectZza3, 1, false);
            zzfon.zzf(jSONObjectZza3);
            zzfpbVar2.zzl.zzd(jSONObjectZza3, zzfpbVar2.zzk.zzf(), jNanoTime);
        } else {
            zzfpbVar2 = zzfpbVar;
            zzfpbVar2.zzl.zzb();
        }
        zzfpbVar2.zzk.zzg();
        long jNanoTime2 = System.nanoTime() - zzfpbVar2.zzm;
        if (zzfpbVar2.zzf.size() > 0) {
            for (zzfpa zzfpaVar : zzfpbVar2.zzf) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfpaVar.zzb();
                if (zzfpaVar instanceof zzfoz) {
                    ((zzfoz) zzfpaVar).zza();
                }
            }
        }
        zzfob.zza().zzc();
    }

    private final void zzk(View view, zzfod zzfodVar, JSONObject jSONObject, int i, boolean z4) {
        zzfodVar.zzb(view, jSONObject, this, i == 1, z4);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoc
    public final void zza(View view, zzfod zzfodVar, JSONObject jSONObject, boolean z4) {
        int iZzl;
        boolean z10;
        if (zzfos.zza(view) != null || (iZzl = this.zzk.zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfodVar.zza(view);
        zzfon.zzc(jSONObject, jSONObjectZza);
        String strZzd = this.zzk.zzd(view);
        if (strZzd != null) {
            zzfon.zzb(jSONObjectZza, strZzd);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzk(view)));
            } catch (JSONException e) {
                zzfoo.zza("Error with setting has window focus", e);
            }
            boolean zZzj = this.zzk.zzj(strZzd);
            Boolean boolValueOf = Boolean.valueOf(zZzj);
            if (zZzj) {
                try {
                    jSONObjectZza.put("isPipActive", boolValueOf);
                } catch (JSONException e4) {
                    zzfoo.zza("Error with setting is picture-in-picture active", e4);
                }
            }
            this.zzk.zzh();
            this = this;
        } else {
            zzfot zzfotVarZzb = this.zzk.zzb(view);
            if (zzfotVarZzb != null) {
                zzfnu zzfnuVarZza = zzfotVarZzb.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzb = zzfotVarZzb.zzb();
                int size = arrayListZzb.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) arrayListZzb.get(i));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfnuVarZza.zzd());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfnuVarZza.zza());
                    jSONObjectZza.put("friendlyObstructionReason", zzfnuVarZza.zzc());
                } catch (JSONException e10) {
                    zzfoo.zza("Error with setting friendly obstruction", e10);
                }
                z10 = true;
            } else {
                z10 = false;
            }
            zzk(view, zzfodVar, jSONObjectZza, iZzl, z4 || z10);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfow(this));
    }
}
