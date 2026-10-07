package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import w7.f;
import w7.g;
import w7.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzz {
    public final q flushLocations(o oVar) {
        return ((i0) oVar).f2119b.doWrite(new zzq(this, oVar));
    }

    public final Location getLastLocation(o oVar) {
        i iVar = h.f9703a;
        com.google.android.gms.common.internal.i0.a("GoogleApiClient parameter is required.", oVar != null);
        oVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final LocationAvailability getLocationAvailability(o oVar) {
        i iVar = h.f9703a;
        com.google.android.gms.common.internal.i0.a("GoogleApiClient parameter is required.", oVar != null);
        oVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final q removeLocationUpdates(o oVar, PendingIntent pendingIntent) {
        return ((i0) oVar).f2119b.doWrite(new zzw(this, oVar, pendingIntent));
    }

    public final q requestLocationUpdates(o oVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return ((i0) oVar).f2119b.doWrite(new zzu(this, oVar, locationRequest, pendingIntent));
    }

    public final q setMockLocation(o oVar, Location location) {
        return ((i0) oVar).f2119b.doWrite(new zzp(this, oVar, location));
    }

    public final q setMockMode(o oVar, boolean z4) {
        return ((i0) oVar).f2119b.doWrite(new zzo(this, oVar, z4));
    }

    public final q removeLocationUpdates(o oVar, f fVar) {
        return ((i0) oVar).f2119b.doWrite(new zzn(this, oVar, fVar));
    }

    public final q requestLocationUpdates(o oVar, LocationRequest locationRequest, f fVar, Looper looper) {
        return ((i0) oVar).f2119b.doWrite(new zzt(this, oVar, locationRequest, fVar, looper));
    }

    public final q removeLocationUpdates(o oVar, g gVar) {
        return ((i0) oVar).f2119b.doWrite(new zzv(this, oVar, gVar));
    }

    public final q requestLocationUpdates(o oVar, LocationRequest locationRequest, g gVar) {
        com.google.android.gms.common.internal.i0.j(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return ((i0) oVar).f2119b.doWrite(new zzr(this, oVar, locationRequest, gVar));
    }

    public final q requestLocationUpdates(o oVar, LocationRequest locationRequest, g gVar, Looper looper) {
        return ((i0) oVar).f2119b.doWrite(new zzs(this, oVar, locationRequest, gVar, looper));
    }
}
