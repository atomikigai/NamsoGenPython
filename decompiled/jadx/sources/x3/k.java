package x3;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p4.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f10289d;
    public static final Bitmap.Config[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f10290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f10291g;
    public static final Bitmap.Config[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f10292a = new e(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5.j f10293b = new s5.j(15);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10294c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f10289d = configArr;
        e = configArr;
        f10290f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f10291g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(n.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i, int i10, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = n.d(config) * i * i10;
        e eVar = this.f10292a;
        h hVarD = (h) ((ArrayDeque) eVar.f159a).poll();
        if (hVarD == null) {
            hVarD = eVar.d();
        }
        j jVar = (j) hVarD;
        jVar.f10287b = iD;
        jVar.f10288c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i11 = i.f10285a[config.ordinal()];
            if (i11 == 1) {
                configArr = f10289d;
            } else if (i11 == 2) {
                configArr = f10290f;
            } else if (i11 != 3) {
                configArr = i11 != 4 ? new Bitmap.Config[]{config} : h;
            } else {
                configArr = f10291g;
            }
        } else {
            configArr = e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num != null && num.intValue() <= iD * 8) {
                if (num.intValue() == iD && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                eVar.b(jVar);
                int iIntValue = num.intValue();
                h hVarD2 = (h) ((ArrayDeque) eVar.f159a).poll();
                if (hVarD2 == null) {
                    hVarD2 = eVar.d();
                }
                jVar = (j) hVarD2;
                jVar.f10287b = iIntValue;
                jVar.f10288c = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f10293b.j(jVar);
        if (bitmap != null) {
            a(Integer.valueOf(jVar.f10287b), bitmap);
            bitmap.reconfigure(i, i10, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.f10294c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = n.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        e eVar = this.f10292a;
        h hVarD = (h) ((ArrayDeque) eVar.f159a).poll();
        if (hVarD == null) {
            hVarD = eVar.d();
        }
        j jVar = (j) hVarD;
        jVar.f10287b = iC;
        jVar.f10288c = config;
        this.f10293b.w(jVar, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(jVar.f10287b));
        navigableMapD.put(Integer.valueOf(jVar.f10287b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbB = u.e.b("SizeConfigStrategy{groupedMap=");
        sbB.append(this.f10293b);
        sbB.append(", sortedSizes=(");
        HashMap map = this.f10294c;
        for (Map.Entry entry : map.entrySet()) {
            sbB.append(entry.getKey());
            sbB.append('[');
            sbB.append(entry.getValue());
            sbB.append("], ");
        }
        if (!map.isEmpty()) {
            sbB.replace(sbB.length() - 2, sbB.length(), "");
        }
        sbB.append(")}");
        return sbB.toString();
    }
}
