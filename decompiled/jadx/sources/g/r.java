package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import fa.c1;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends androidx.fragment.app.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4067c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f4068d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, a2.l lVar) {
        super(uVar);
        this.f4068d = uVar;
        this.e = lVar;
    }

    @Override // androidx.fragment.app.f
    public final IntentFilter e() {
        switch (this.f4067c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // androidx.fragment.app.f
    public final int f() {
        Location location;
        boolean z4;
        long j4;
        Location lastKnownLocation;
        switch (this.f4067c) {
            case 0:
                return ((PowerManager) this.e).isPowerSaveMode() ? 2 : 1;
            default:
                a2.l lVar = (a2.l) this.e;
                e0 e0Var = (e0) lVar.f45d;
                LocationManager locationManager = (LocationManager) lVar.f44c;
                if (e0Var.f4017b <= System.currentTimeMillis()) {
                    Context context = (Context) lVar.f43b;
                    Location lastKnownLocation2 = null;
                    if (c1.l(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (c1.l(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e4) {
                            Log.d("TwilightManager", "Failed to get last known location", e4);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z4 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (d0.f3989d == null) {
                            d0.f3989d = new d0();
                        }
                        d0 d0Var = d0.f3989d;
                        d0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        d0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z4 = d0Var.f3992c == 1;
                        long j10 = d0Var.f3991b;
                        long j11 = d0Var.f3990a;
                        d0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j12 = d0Var.f3991b;
                        if (j10 == -1 || j11 == -1) {
                            j4 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j11) {
                                j10 = j12;
                            } else if (jCurrentTimeMillis > j10) {
                                j10 = j11;
                            }
                            j4 = j10 + 60000;
                        }
                        e0Var.f4016a = z4;
                        e0Var.f4017b = j4;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z4 = true;
                        }
                    }
                    break;
                } else {
                    z4 = e0Var.f4016a;
                }
                return z4 ? 2 : 1;
        }
    }

    @Override // androidx.fragment.app.f
    public final void h() {
        switch (this.f4067c) {
            case 0:
                this.f4068d.r(true, true);
                break;
            default:
                this.f4068d.r(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, Context context) {
        super(uVar);
        this.f4068d = uVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
