package w2;

import a2.l;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c3.i;
import da.v;
import java.util.ArrayList;
import java.util.HashMap;
import t2.m;
import u2.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements u2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f9449d = m.f("CommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9451b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9452c = new Object();

    public b(Context context) {
        this.f9450a = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // u2.a
    public final void c(String str, boolean z4) {
        synchronized (this.f9452c) {
            try {
                u2.a aVar = (u2.a) this.f9451b.remove(str);
                if (aVar != null) {
                    aVar.c(str, z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Intent intent, int i, g gVar) {
        boolean z4;
        String action = intent.getAction();
        int i10 = 6;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m.d().a(f9449d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f9450a;
            d dVar = new d(context, i, gVar);
            y2.c cVar = dVar.f9456b;
            ArrayList arrayListG = gVar.e.f8821o.x().g();
            String str = c.f9453a;
            int size = arrayListG.size();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListG.get(i11);
                i11++;
                t2.c cVar2 = ((i) obj).f1750j;
                z10 |= cVar2.f8535d;
                z11 |= cVar2.f8533b;
                z12 |= cVar2.e;
                z13 |= cVar2.f8532a != 1;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f1261a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            cVar.b(arrayListG);
            ArrayList arrayList = new ArrayList(arrayListG.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListG.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayListG.get(i12);
                i12++;
                i iVar = (i) obj2;
                String str3 = iVar.f1744a;
                if (jCurrentTimeMillis >= iVar.a() && (!iVar.b() || cVar.a(str3))) {
                    arrayList.add(iVar);
                }
            }
            int size3 = arrayList.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList.get(i13);
                i13++;
                String str4 = ((i) obj3).f1744a;
                Intent intentA = a(context, str4);
                m.d().a(d.f9454c, v.i("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                gVar.e(new androidx.activity.g(gVar, intentA, dVar.f9455a, i10));
            }
            cVar.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m.d().a(f9449d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            gVar.e.V();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            m.d().b(f9449d, v.i("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f9450a;
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            m mVarD = m.d();
            String str5 = f9449d;
            mVarD.a(str5, u3.b.b("Handling schedule work for ", string), new Throwable[0]);
            j jVar = gVar.e;
            WorkDatabase workDatabase = jVar.f8821o;
            workDatabase.c();
            try {
                i iVarL = workDatabase.x().l(string);
                if (iVarL == null) {
                    m.d().h(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                    return;
                }
                if (v.a(iVarL.f1745b)) {
                    m.d().h(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                    return;
                }
                long jA = iVarL.a();
                if (iVarL.b()) {
                    m.d().a(str5, "Opportunistically setting an alarm for " + string + " at " + jA, new Throwable[0]);
                    a.b(context2, jVar, string, jA);
                    Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                    gVar.e(new androidx.activity.g(gVar, intent3, i, 6));
                } else {
                    m.d().a(str5, "Setting up Alarms for " + string + " at " + jA, new Throwable[0]);
                    a.b(context2, jVar, string, jA);
                }
                workDatabase.q();
                return;
            } finally {
                workDatabase.n();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f9452c) {
                try {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    m mVarD2 = m.d();
                    String str6 = f9449d;
                    mVarD2.a(str6, "Handing delay met for " + string2, new Throwable[0]);
                    if (this.f9451b.containsKey(string2)) {
                        m.d().a(str6, "WorkSpec " + string2 + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                    } else {
                        e eVar = new e(this.f9450a, i, string2, gVar);
                        this.f9451b.put(string2, eVar);
                        eVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                m.d().h(f9449d, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z14 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            m.d().a(f9449d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            c(string3, z14);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        m.d().a(f9449d, u3.b.b("Handing stopWork work for ", string4), new Throwable[0]);
        gVar.e.X(string4);
        Context context3 = this.f9450a;
        j jVar2 = gVar.e;
        String str7 = a.f9448a;
        l lVarU = jVar2.f8821o.u();
        c3.d dVarZ = lVarU.z(string4);
        if (dVarZ != null) {
            a.a(context3, string4, dVarZ.f1737b);
            z4 = false;
            m.d().a(a.f9448a, v.i("Removing SystemIdInfo for workSpecId (", string4, ")"), new Throwable[0]);
            lVarU.J(string4);
        } else {
            z4 = false;
        }
        gVar.c(string4, z4);
    }
}
