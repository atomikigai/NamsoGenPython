package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.i0;
import java.util.ArrayList;
import java.util.List;
import w7.d;
import w7.e;
import w7.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaf {
    @Deprecated
    public final q addGeofences(o oVar, List<d> list, PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (d dVar : list) {
                if (dVar != null) {
                    i0.a("Geofence must be created using Geofence.Builder.", dVar instanceof zzbe);
                    arrayList.add((zzbe) dVar);
                }
            }
        }
        i0.a("No geofence has been added to this request.", !arrayList.isEmpty());
        return ((com.google.android.gms.common.api.internal.i0) oVar).f2119b.doWrite(new zzac(this, oVar, new e(arrayList, 5, "", null), pendingIntent));
    }

    public final q removeGeofences(o oVar, PendingIntent pendingIntent) {
        i0.j(pendingIntent, "PendingIntent can not be null.");
        return zza(oVar, new z(null, pendingIntent, ""));
    }

    public final q zza(o oVar, z zVar) {
        return ((com.google.android.gms.common.api.internal.i0) oVar).f2119b.doWrite(new zzad(this, oVar, zVar));
    }

    public final q removeGeofences(o oVar, List<String> list) {
        i0.j(list, "geofence can't be null.");
        i0.a("Geofences must contains at least one id.", !list.isEmpty());
        return zza(oVar, new z(list, null, ""));
    }

    public final q addGeofences(o oVar, e eVar, PendingIntent pendingIntent) {
        return ((com.google.android.gms.common.api.internal.i0) oVar).f2119b.doWrite(new zzac(this, oVar, eVar, pendingIntent));
    }
}
