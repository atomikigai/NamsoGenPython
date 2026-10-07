package h0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class h extends jd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Class f4554a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Constructor f4555b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f4556c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f4557d = null;
    public static boolean e = false;

    public static boolean Q(Object obj, String str, int i, boolean z4) throws NoSuchMethodException {
        R();
        try {
            return ((Boolean) f4556c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void R() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f4555b = constructor;
        f4554a = cls;
        f4556c = method2;
        f4557d = method;
    }

    @Override // jd.d
    public Typeface j(Context context, g0.f fVar, Resources resources, int i) throws NoSuchMethodException {
        R();
        try {
            Object objNewInstance = f4555b.newInstance(null);
            for (g0.g gVar : fVar.f4134a) {
                File fileL = jd.l.l(context);
                if (fileL == null) {
                    return null;
                }
                try {
                    if (!jd.l.g(fileL, resources, gVar.f4139f)) {
                        return null;
                    }
                    if (!Q(objNewInstance, fileL.getPath(), gVar.f4136b, gVar.f4137c)) {
                        return null;
                    }
                    fileL.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileL.delete();
                }
            }
            R();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f4554a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f4557d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // jd.d
    public Typeface k(Context context, n0.g[] gVarArr, int i) {
        File file;
        if (gVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(p(gVarArr, i).f7144a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceL = l(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceL;
                    } catch (Throwable th3) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
