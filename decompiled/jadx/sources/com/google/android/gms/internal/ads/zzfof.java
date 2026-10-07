package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfof implements zzfod {
    private final zzfod zza;

    public zzfof(zzfod zzfodVar) {
        this.zza = zzfodVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfod
    public final JSONObject zza(View view) {
        JSONObject jSONObjectZza = zzfon.zza(0, 0, 0, 0);
        int iZzb = zzfoq.zzb();
        int i = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZza.put("noOutputDevice", i == 0);
            return jSONObjectZza;
        } catch (JSONException e) {
            zzfoo.zza("Error with setting output device status", e);
            return jSONObjectZza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfod
    public final void zzb(View view, JSONObject jSONObject, zzfoc zzfocVar, boolean z4, boolean z10) {
        ArrayList arrayList = new ArrayList();
        zzfnr zzfnrVarZza = zzfnr.zza();
        if (zzfnrVarZza != null) {
            Collection collectionZzb = zzfnrVarZza.zzb();
            int size = collectionZzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzb.iterator();
            while (it.hasNext()) {
                View viewZzf = ((zzfna) it.next()).zzf();
                if (viewZzf != null && viewZzf.isAttachedToWindow() && viewZzf.isShown()) {
                    View view2 = viewZzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z11 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z11) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == 0.0f) {
                            break;
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i10 = 0; i10 < size3; i10++) {
            zzfocVar.zza((View) arrayList.get(i10), this.zza, jSONObject, z10);
        }
    }
}
