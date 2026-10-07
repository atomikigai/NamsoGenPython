package da;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import fa.k0;
import fa.l0;
import fa.n0;
import fa.p0;
import fa.t1;
import h6.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f3154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f3155g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f3157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f3158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f3159d;
    public final c3.j e;

    static {
        HashMap map = new HashMap();
        f3154f = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f3155g = "Crashlytics Android SDK/18.4.3";
    }

    public t(Context context, z zVar, a aVar, o0 o0Var, c3.j jVar) {
        this.f3156a = context;
        this.f3157b = zVar;
        this.f3158c = aVar;
        this.f3159d = o0Var;
        this.e = jVar;
    }

    public static l0 c(a3.j jVar, int i) {
        String str = (String) jVar.f108b;
        String str2 = (String) jVar.f107a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) jVar.f109c;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        a3.j jVar2 = (a3.j) jVar.f110d;
        if (i >= 8) {
            a3.j jVar3 = jVar2;
            while (jVar3 != null) {
                jVar3 = (a3.j) jVar3.f110d;
                i10++;
            }
        }
        int i11 = i10;
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        t1 t1Var = new t1(d(stackTraceElementArr, 4));
        l0 l0VarC = null;
        if (jVar2 != null && i11 == 0) {
            l0VarC = c(jVar2, i + 1);
        }
        return new l0(str, str2, t1Var, l0VarC, i11);
    }

    public static t1 d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            bd.u uVar = new bd.u(2);
            uVar.f1679f = Integer.valueOf(i);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            uVar.f1677c = Long.valueOf(jMax);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            uVar.f1676b = str;
            uVar.f1678d = fileName;
            uVar.e = Long.valueOf(lineNumber);
            arrayList.add(uVar.c());
        }
        return new t1(arrayList);
    }

    public static n0 e(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        String name = thread.getName();
        if (name != null) {
            return new n0(name, i, new t1(d(stackTraceElementArr, i)));
        }
        throw new NullPointerException("Null name");
    }

    public final t1 a() {
        a aVar = this.f3158c;
        String str = aVar.e;
        if (str != null) {
            return new t1(Arrays.asList(new k0(str, aVar.f3083b, 0L, 0L)));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    public final p0 b(int i) {
        boolean z4;
        Float fValueOf;
        long j4;
        Context context = this.f3156a;
        int i10 = 2;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z4 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z4 || fValueOf == null) {
                    i10 = 1;
                } else if (fValueOf.floatValue() >= 0.99d) {
                    i10 = 3;
                }
                boolean z10 = h.g() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
                long jB = h.b(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j4 = jB - memoryInfo.availMem;
                if (j4 <= 0) {
                    j4 = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                bd.v vVar = new bd.v(4);
                vVar.f1682c = dValueOf;
                vVar.f1681b = Integer.valueOf(i10);
                vVar.f1683d = Boolean.valueOf(z10);
                vVar.e = Integer.valueOf(i);
                vVar.f1684f = Long.valueOf(j4);
                vVar.f1685g = Long.valueOf(blockCount);
                return vVar.d();
            }
            z4 = false;
        } catch (IllegalStateException e4) {
            e = e4;
            z4 = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z4) {
            i10 = 1;
        } else {
            i10 = 1;
        }
        if (h.g()) {
        }
        long jB2 = h.b(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j4 = jB2 - memoryInfo2.availMem;
        if (j4 <= 0) {
            j4 = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        bd.v vVar2 = new bd.v(4);
        vVar2.f1682c = dValueOf;
        vVar2.f1681b = Integer.valueOf(i10);
        vVar2.f1683d = Boolean.valueOf(z10);
        vVar2.e = Integer.valueOf(i);
        vVar2.f1684f = Long.valueOf(j4);
        vVar2.f1685g = Long.valueOf(blockCount2);
        return vVar2.d();
    }
}
