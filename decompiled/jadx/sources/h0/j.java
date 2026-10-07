package h0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class j extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f4562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Constructor f4563g;
    public final Method h;
    public final Method i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f4564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f4565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f4566l;

    public j() throws NoSuchMethodException {
        Method methodW;
        Constructor<?> constructor;
        Method methodV;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodV = V(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodW = W(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodW = null;
            constructor = null;
            methodV = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f4562f = cls;
        this.f4563g = constructor;
        this.h = methodV;
        this.i = method;
        this.f4564j = method2;
        this.f4565k = method3;
        this.f4566l = methodW;
    }

    public static Method V(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean S(Context context, Object obj, String str, int i, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface T(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f4562f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f4566l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean U(Object obj) {
        try {
            return ((Boolean) this.f4564j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method W(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // h0.h, jd.d
    public final Typeface j(Context context, g0.f fVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.j(context, fVar, resources, i);
        }
        try {
            objNewInstance = this.f4563g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            g0.g[] gVarArr = fVar.f4134a;
            int length = gVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                g0.g gVar = gVarArr[i10];
                Context context2 = context;
                if (S(context2, objNewInstance, gVar.f4135a, gVar.e, gVar.f4136b, gVar.f4137c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f4138d))) {
                    i10++;
                    context = context2;
                } else {
                    try {
                        this.f4565k.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            if (U(objNewInstance)) {
                return T(objNewInstance);
            }
        }
        return null;
    }

    @Override // h0.h, jd.d
    public final Typeface k(Context context, n0.g[] gVarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceT;
        boolean zBooleanValue;
        if (gVarArr.length >= 1) {
            Method method = this.h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (n0.g gVar : gVarArr) {
                        if (gVar.e == 0) {
                            Uri uri = gVar.f7144a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, jd.l.o(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f4563g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = gVarArr.length;
                        int i10 = 0;
                        boolean z4 = false;
                        while (true) {
                            Method method2 = this.f4565k;
                            if (i10 >= length) {
                                if (!z4) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!U(objNewInstance) || (typefaceT = T(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceT, i);
                            }
                            n0.g gVar2 = gVarArr[i10];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(gVar2.f7144a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.i.invoke(objNewInstance, byteBuffer, Integer.valueOf(gVar2.f7145b), null, Integer.valueOf(gVar2.f7146c), Integer.valueOf(gVar2.f7147d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z4 = true;
                            }
                            i10++;
                            z4 = z4;
                        }
                    }
                } else {
                    n0.g gVarP = p(gVarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(gVarP.f7144a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(gVarP.f7146c).setItalic(gVarP.f7147d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // jd.d
    public final Typeface m(Context context, Resources resources, int i, String str, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.m(context, resources, i, str, i10);
        }
        try {
            objNewInstance = this.f4563g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!S(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f4565k.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (U(objNewInstance)) {
                return T(objNewInstance);
            }
        }
        return null;
    }
}
