package com.google.android.gms.internal.ads;

import e6.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdvf {
    private final zzdup zza;
    private final zzdqa zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzdvf(zzdup zzdupVar, zzdqa zzdqaVar) {
        this.zza = zzdupVar;
        this.zzb = zzdqaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        zzdpz zzdpzVarZza;
        zzdpz zzdpzVarZza2;
        zzbru zzbruVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzblp zzblpVar = (zzblp) it.next();
                    zzbce zzbceVar = zzbcn.zziV;
                    t tVar = t.f3437d;
                    String string = (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() || (zzdpzVarZza2 = this.zzb.zza(zzblpVar.zza)) == null || (zzbruVar = zzdpzVarZza2.zzc) == null) ? "" : zzbruVar.toString();
                    String str = string;
                    boolean z4 = ((Boolean) tVar.f3440c.zza(zzbcn.zziW)).booleanValue() && (zzdpzVarZza = this.zzb.zza(zzblpVar.zza)) != null && zzdpzVarZza.zzd;
                    List list2 = this.zzd;
                    String str2 = zzblpVar.zza;
                    list2.add(new zzdve(str2, str, this.zzb.zzb(str2), zzblpVar.zzb ? 1 : 0, zzblpVar.zzd, zzblpVar.zzc, z4));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    if (!this.zza.zzt()) {
                        zzc();
                        return jSONArray;
                    }
                    zzd(this.zza.zzg());
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzdve) it.next()).zza());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdvd(this));
    }
}
