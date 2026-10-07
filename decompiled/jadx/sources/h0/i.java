package h0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends jd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f4558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Constructor f4559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f4560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f4561d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f4559b = constructor;
        f4558a = cls;
        f4560c = method2;
        f4561d = method;
    }

    public static boolean Q(Object obj, ByteBuffer byteBuffer, int i, int i10, boolean z4) {
        try {
            return ((Boolean) f4560c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i10), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface R(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f4558a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f4561d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // jd.d
    public final Typeface j(Context context, g0.f fVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f4559b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (g0.g gVar : fVar.f4134a) {
                int i10 = gVar.f4139f;
                File fileL = jd.l.l(context);
                if (fileL != null) {
                    try {
                        if (jd.l.g(fileL, resources, i10)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileL);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileL.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileL.delete();
                        }
                        if (map != null && Q(objNewInstance, map, gVar.e, gVar.f4136b, gVar.f4137c)) {
                        }
                    } catch (Throwable th3) {
                        fileL.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return R(objNewInstance);
        }
        return null;
    }

    @Override // jd.d
    public final Typeface k(Context context, n0.g[] gVarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = f4559b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            r.k kVar = new r.k(0);
            for (n0.g gVar : gVarArr) {
                Uri uri = gVar.f7144a;
                ByteBuffer byteBufferO = (ByteBuffer) kVar.get(uri);
                if (byteBufferO == null) {
                    byteBufferO = jd.l.o(context, uri);
                    kVar.put(uri, byteBufferO);
                }
                if (byteBufferO != null && Q(objNewInstance, byteBufferO, gVar.f7145b, gVar.f7146c, gVar.f7147d)) {
                }
            }
            Typeface typefaceR = R(objNewInstance);
            if (typefaceR != null) {
                return Typeface.create(typefaceR, i);
            }
        }
        return null;
    }
}
