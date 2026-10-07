package jd;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.credentials.Credential;
import com.ismaeldivita.chipnavigation.view.BadgeImageView;
import da.v;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Logger;
import od.u;
import pc.o;
import q0.c1;
import w9.b0;
import w9.d0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final kc.e a(long j4) {
        int i = (int) j4;
        int i10 = (int) (j4 >> 32);
        int i11 = ~i;
        kc.e eVar = new kc.e();
        eVar.f6208c = i;
        eVar.f6209d = i10;
        eVar.e = 0;
        eVar.f6210f = 0;
        eVar.f6211r = i11;
        eVar.f6212s = (i << 10) ^ (i10 >>> 4);
        if ((i10 | i | i11) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i12 = 0; i12 < 64; i12++) {
            eVar.b();
        }
        return eVar;
    }

    public static final String b(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static Credential c(v9.n nVar, String str, String str2) {
        String str3;
        String str4;
        d0 d0Var = (d0) nVar;
        b0 b0Var = d0Var.f9820b;
        String str5 = b0Var.f9810f;
        String str6 = b0Var.f9811r;
        Uri uri = nVar.h() == null ? null : Uri.parse(nVar.h().toString());
        if (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6)) {
            Log.w("CredentialUtils", "User (accountType=" + str2 + ") has no email or phone number, cannot build credential.");
            return null;
        }
        if (str == null && str2 == null) {
            Log.w("CredentialUtils", "User has no accountType or password, cannot build credential.");
            return null;
        }
        String str7 = TextUtils.isEmpty(str5) ? str6 : str5;
        String str8 = d0Var.f9820b.f9808c;
        if (TextUtils.isEmpty(str)) {
            str4 = str2;
            str3 = null;
        } else {
            str3 = str;
            str4 = null;
        }
        return new Credential(str7, str8, uri, null, str3, str4, null, null);
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final ValueAnimator e(BadgeImageView badgeImageView, int i, int i10, PorterDuff.Mode mode) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i10));
        valueAnimatorOfObject.setDuration(350L);
        valueAnimatorOfObject.addUpdateListener(new c1(mode, valueAnimatorOfObject, badgeImageView));
        return valueAnimatorOfObject;
    }

    public static int f(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static boolean g(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zH = h(file, inputStreamOpenRawResource);
                d(inputStreamOpenRawResource);
                return zH;
            } catch (Throwable th) {
                th = th;
                d(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean h(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            d(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    d(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    d(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static n3.a i(String str) {
        String strSubstring;
        jc.i.e(str, "bin");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        jc.i.d(lowerCase, "toLowerCase(...)");
        StringBuilder sb2 = new StringBuilder();
        int length = lowerCase.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = lowerCase.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        if (string.length() < 2) {
            return n3.a.f7234u;
        }
        String strSubstring2 = string.substring(0, 2);
        jc.i.d(strSubstring2, "substring(...)");
        String strSubstring3 = "";
        if (string.length() >= 3) {
            strSubstring = string.substring(0, 3);
            jc.i.d(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        if (string.length() >= 4) {
            strSubstring3 = string.substring(0, 4);
            jc.i.d(strSubstring3, "substring(...)");
        }
        mc.e eVar = new mc.e(3528, 3589, 1);
        Integer numY = pc.n.Y(strSubstring3);
        if (numY != null && eVar.d(numY.intValue())) {
            return n3.a.f7231r;
        }
        mc.e eVar2 = new mc.e(3337, 3349, 1);
        Integer numY2 = pc.n.Y(strSubstring3);
        if (numY2 != null && eVar2.d(numY2.intValue())) {
            return n3.a.f7230f;
        }
        int iHashCode = strSubstring2.hashCode();
        if (iHashCode == 1632 ? strSubstring2.equals("33") : iHashCode == 1633 ? strSubstring2.equals("34") : iHashCode == 1636 && strSubstring2.equals("37")) {
            return n3.a.f7228c;
        }
        if (string.charAt(0) == '4') {
            return n3.a.f7229d;
        }
        mc.e eVar3 = new mc.e(51, 55, 1);
        Integer numY3 = pc.n.Y(strSubstring2);
        if (numY3 != null && eVar3.d(numY3.intValue())) {
            return n3.a.e;
        }
        mc.e eVar4 = new mc.e(2221, 2720, 1);
        Integer numY4 = pc.n.Y(strSubstring3);
        if (numY4 != null && eVar4.d(numY4.intValue())) {
            return n3.a.e;
        }
        if (!o.e0(string, "6011", false) && !strSubstring2.equals("65")) {
            mc.e eVar5 = new mc.e(644, 649, 1);
            Integer numY5 = pc.n.Y(strSubstring);
            if (numY5 == null || !eVar5.d(numY5.intValue())) {
                if (!strSubstring2.equals("36") && !strSubstring2.equals("38")) {
                    mc.e eVar6 = new mc.e(300, 305, 1);
                    Integer numY6 = pc.n.Y(strSubstring);
                    if (numY6 == null || !eVar6.d(numY6.intValue())) {
                        return strSubstring2.equals("62") ? n3.a.f7233t : n3.a.f7234u;
                    }
                }
                return n3.a.f7232s;
            }
        }
        return n3.a.f7230f;
    }

    public static final int j(Cursor cursor, String str) {
        String strP;
        jc.i.e(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    jc.i.b(columnNames);
                    String strConcat = ".".concat(str);
                    String str2 = "." + str + '`';
                    int length = columnNames.length;
                    int i = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            String str3 = columnNames[i10];
                            int i11 = i + 1;
                            if (str3.length() < str.length() + 2 || !(o.Z(str3, strConcat) || (str3.charAt(0) == '`' && o.Z(str3, str2)))) {
                                i10++;
                                i = i11;
                            } else {
                                columnIndex = i;
                            }
                        } else {
                            columnIndex = -1;
                        }
                    }
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            jc.i.d(columnNames2, "getColumnNames(...)");
            strP = vb.h.P(63, columnNames2);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            strP = "unknown";
        }
        throw new IllegalArgumentException(v.j("column '", str, "' does not exist. Available columns: ", strP));
    }

    public static final int k(int i, int i10, int i11) {
        if (i11 > 0) {
            if (i < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
        } else {
            if (i11 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i10) {
                int i15 = -i11;
                int i16 = i % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i18 + i10;
            }
        }
        return i10;
    }

    public static File l(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static int m(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(v.f(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final boolean n(AssertionError assertionError) {
        Logger logger = od.m.f7747a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? pc.g.f0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static MappedByteBuffer o(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorA = h0.m.a(context.getContentResolver(), uri, "r", null);
            if (parcelFileDescriptorA == null) {
                if (parcelFileDescriptorA != null) {
                    parcelFileDescriptorA.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorA.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorA.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorA.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final int p(mc.e eVar) {
        kc.c cVar = kc.d.f6206a;
        int i = eVar.f7106a;
        if (eVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + eVar);
        }
        int i10 = eVar.f7107b;
        if (i10 < Integer.MAX_VALUE) {
            return kc.d.f6207b.c(i, i10 + 1);
        }
        if (i <= Integer.MIN_VALUE) {
            return kc.d.f6207b.b();
        }
        return kc.d.f6207b.c(i - 1, i10) + 1;
    }

    public static final long q(mc.g gVar) {
        kc.c cVar = kc.d.f6206a;
        long j4 = gVar.f7114a;
        long j10 = gVar.f7115b;
        if (j4 > j10) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + gVar);
        }
        if (j10 < Long.MAX_VALUE) {
            return kc.d.f6207b.e(j4, j10 + 1);
        }
        if (j4 <= Long.MIN_VALUE) {
            return kc.d.f6207b.d();
        }
        return kc.d.f6207b.e(j4 - 1, j10) + 1;
    }

    public static String t(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb2 = new StringBuilder("sha256/");
        od.i iVar = od.i.f7735d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        jc.i.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        fa.c1.k(encoded.length, 0, length);
        fa.c1.n(length, encoded.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 0, length);
        jc.i.d(bArrCopyOfRange, "copyOfRange(...)");
        od.i iVar2 = new od.i(bArrCopyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrCopyOfRange, 0, iVar2.a());
        byte[] bArrDigest = messageDigest.digest();
        jc.i.b(bArrDigest);
        new od.i(bArrDigest);
        byte[] bArr = od.a.f7720a;
        jc.i.e(bArr, "map");
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length2 = bArrDigest.length - (bArrDigest.length % 3);
        int i10 = 0;
        while (i < length2) {
            byte b10 = bArrDigest[i];
            int i11 = i + 2;
            byte b11 = bArrDigest[i + 1];
            i += 3;
            byte b12 = bArrDigest[i11];
            bArr2[i10] = bArr[(b10 & 255) >> 2];
            bArr2[i10 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = bArr[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i10 += 4;
            bArr2[i12] = bArr[b12 & 63];
        }
        int length3 = bArrDigest.length - length2;
        if (length3 == 1) {
            byte b13 = bArrDigest[i];
            bArr2[i10] = bArr[(b13 & 255) >> 2];
            bArr2[i10 + 1] = bArr[(b13 & 3) << 4];
            bArr2[i10 + 2] = 61;
            bArr2[i10 + 3] = 61;
        } else if (length3 == 2) {
            int i13 = i + 1;
            byte b14 = bArrDigest[i];
            byte b15 = bArrDigest[i13];
            bArr2[i10] = bArr[(b14 & 255) >> 2];
            bArr2[i10 + 1] = bArr[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr2[i10 + 2] = bArr[(b15 & 15) << 2];
            bArr2[i10 + 3] = 61;
        }
        sb2.append(new String(bArr2, pc.a.f7846a));
        return sb2.toString();
    }

    public static void u(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final void v(BadgeImageView badgeImageView, int i, int i10, PorterDuff.Mode mode) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{R.attr.state_selected}, e(badgeImageView, i10, i, mode));
        stateListAnimator.addState(new int[0], e(badgeImageView, i, i10, mode));
        badgeImageView.setStateListAnimator(stateListAnimator);
        badgeImageView.refreshDrawableState();
    }

    public static void w(Drawable drawable, int i) {
        i0.b.g(drawable, i);
    }

    public static final od.c x(Socket socket) throws IOException {
        Logger logger = od.m.f7747a;
        u uVar = new u(socket);
        OutputStream outputStream = socket.getOutputStream();
        jc.i.d(outputStream, "getOutputStream(...)");
        return new od.c(uVar, new od.c(outputStream, uVar));
    }

    public static final od.d y(Socket socket) throws IOException {
        Logger logger = od.m.f7747a;
        u uVar = new u(socket);
        InputStream inputStream = socket.getInputStream();
        jc.i.d(inputStream, "getInputStream(...)");
        return new od.d(0, uVar, new od.d(1, inputStream, uVar));
    }

    public static int z(int i) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i) {
                return i11;
            }
        }
        return 1;
    }

    public abstract void r(Throwable th);

    public abstract void s(a3.j jVar);
}
