package d4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3.h f2888f = u3.h.a(u3.a.f8844c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u3.h f2889g = new u3.h("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, u3.h.e);
    public static final u3.h h;
    public static final u3.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final z9.c f2890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f2891k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3.a f2892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f2893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x3.f f2894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2895d;
    public final u e = u.a();

    static {
        m mVar = m.f2882b;
        Boolean bool = Boolean.FALSE;
        h = u3.h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = u3.h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f2890j = new z9.c();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = p4.n.f7811a;
        f2891k = new ArrayDeque(0);
    }

    public o(ArrayList arrayList, DisplayMetrics displayMetrics, x3.a aVar, x3.f fVar) {
        this.f2895d = arrayList;
        p4.f.c(displayMetrics, "Argument must not be null");
        this.f2893b = displayMetrics;
        p4.f.c(aVar, "Argument must not be null");
        this.f2892a = aVar;
        p4.f.c(fVar, "Argument must not be null");
        this.f2894c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(a2.l r9, android.graphics.BitmapFactory.Options r10, d4.n r11, x3.a r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto L22
            r11.d()
            int r1 = r9.f42a
            switch(r1) {
                case 8: goto L22;
                case 9: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r9.f43b
            com.bumptech.glide.load.data.i r1 = (com.bumptech.glide.load.data.i) r1
            java.lang.Object r1 = r1.f1900b
            d4.w r1 = (d4.w) r1
            monitor-enter(r1)
            byte[] r2 = r1.f2906a     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f2908c = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r9
        L22:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = d4.y.f2914d
            r4.lock()
            android.graphics.Bitmap r9 = r9.j(r10)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L7c
            r4.unlock()
            return r9
        L35:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = u3.b.d(r1, r2, r6, r7, r8)     // Catch: java.lang.Throwable -> L7c
            r1.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L7c
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7c
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L7c
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L66
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L7c
        L66:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7b
            r12.c(r0)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            java.util.concurrent.locks.Lock r10 = d4.y.f2914d
            r10.unlock()
            return r9
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7b:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = d4.y.f2914d
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.o.c(a2.l, android.graphics.BitmapFactory$Options, d4.n, x3.a):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final c a(a2.l lVar, int i10, int i11, u3.i iVar, n nVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f2894c.c(65536, byte[].class);
        synchronized (o.class) {
            arrayDeque = f2891k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        u3.a aVar = (u3.a) iVar.c(f2888f);
        u3.j jVar = (u3.j) iVar.c(f2889g);
        m mVar = (m) iVar.c(m.f2886g);
        boolean zBooleanValue = ((Boolean) iVar.c(h)).booleanValue();
        u3.h hVar = i;
        try {
            c cVarC = c.c(b(lVar, options, mVar, aVar, jVar, iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue(), i10, i11, zBooleanValue, nVar), this.f2892a);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            return cVarC;
        } finally {
            e(options);
            ArrayDeque arrayDeque2 = f2891k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f2894c.g(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x035c  */
    /* JADX WARN: Code duplicated, block: B:146:0x038b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0395  */
    /* JADX WARN: Code duplicated, block: B:149:0x0398  */
    /* JADX WARN: Code duplicated, block: B:150:0x039a  */
    /* JADX WARN: Code duplicated, block: B:160:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:165:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:168:0x03dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:173:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:177:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:179:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:180:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:183:0x0421  */
    /* JADX WARN: Code duplicated, block: B:187:0x0460 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x047f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0483  */
    /* JADX WARN: Code duplicated, block: B:201:0x0487  */
    /* JADX WARN: Code duplicated, block: B:203:0x048d  */
    /* JADX WARN: Code duplicated, block: B:208:0x0499  */
    /* JADX WARN: Code duplicated, block: B:210:0x049c  */
    /* JADX WARN: Code duplicated, block: B:211:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:214:0x04af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:218:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:220:0x0550  */
    /* JADX WARN: Code duplicated, block: B:222:0x055a  */
    /* JADX WARN: Code duplicated, block: B:223:0x055d  */
    /* JADX WARN: Code duplicated, block: B:226:0x056e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0572  */
    /* JADX WARN: Code duplicated, block: B:228:0x057b  */
    /* JADX WARN: Code duplicated, block: B:229:0x057f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0588  */
    /* JADX WARN: Code duplicated, block: B:231:0x0591  */
    /* JADX WARN: Code duplicated, block: B:232:0x0595  */
    /* JADX WARN: Code duplicated, block: B:235:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:236:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:240:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:243:0x03a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x0159  */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x035c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:218:0x04cb, please report this as an issue */
    public final Bitmap b(a2.l lVar, BitmapFactory.Options options, m mVar, u3.a aVar, u3.j jVar, boolean z4, int i10, int i11, boolean z10, n nVar) throws Throwable {
        long j4;
        String str;
        int iB;
        int iO;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeY;
        int i16;
        String str2;
        x3.a aVar2;
        String str3;
        int i17;
        boolean zC;
        boolean z12;
        boolean zHasAlpha;
        Bitmap.Config config;
        boolean z13;
        int i18;
        int i19;
        boolean z14;
        float f10;
        int i20;
        int iRound;
        int iRound2;
        int i21;
        x3.a aVar3;
        Bitmap bitmapC;
        Matrix matrix;
        Bitmap.Config config2;
        Bitmap bitmapH;
        boolean z15;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap.Config config3;
        int i22;
        int i23;
        int iFloor;
        int iFloor2;
        int iRound3;
        int i24 = p4.h.f7800b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        x3.a aVar4 = this.f2892a;
        c(lVar, options, nVar, aVar4);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i25 = iArr[0];
        int i26 = iArr[1];
        String str4 = options.outMimeType;
        boolean z16 = (i25 == -1 || i26 == -1) ? false : z4;
        w wVar = null;
        switch (lVar.f42a) {
            case 8:
                j4 = jElapsedRealtimeNanos;
                str = str4;
                List list = (List) lVar.f44c;
                ByteBuffer byteBufferC = p4.b.c((ByteBuffer) lVar.f43b);
                x3.f fVar = (x3.f) lVar.f45d;
                if (byteBufferC != null) {
                    int size = list.size();
                    int i27 = 0;
                    while (true) {
                        if (i27 < size) {
                            List list2 = list;
                            try {
                                iB = ((u3.e) list.get(i27)).b(byteBufferC, fVar);
                                x3.f fVar2 = fVar;
                                if (iB != -1) {
                                    iO = iB;
                                    switch (iO) {
                                        case 3:
                                        case 4:
                                            i12 = 180;
                                            break;
                                        case 5:
                                        case 6:
                                            i12 = 90;
                                            break;
                                        case 7:
                                        case 8:
                                            i12 = 270;
                                            break;
                                        default:
                                            i12 = 0;
                                            break;
                                    }
                                    switch (iO) {
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z11 = true;
                                            break;
                                        default:
                                            z11 = false;
                                            break;
                                    }
                                    if (i10 == Integer.MIN_VALUE) {
                                        if (i12 != 90) {
                                            i13 = 270;
                                            if (i12 == 270) {
                                                i14 = i25;
                                            }
                                        } else {
                                            i13 = 270;
                                        }
                                        i14 = i26;
                                    } else {
                                        i13 = 270;
                                        i14 = i10;
                                    }
                                    if (i11 == Integer.MIN_VALUE) {
                                        i15 = i11;
                                    } else if (i12 != 90 || i12 == i13) {
                                        i15 = i25;
                                    } else {
                                        i15 = i26;
                                    }
                                    imageHeaderParser$ImageTypeY = lVar.y();
                                    i16 = iO;
                                    boolean z17 = z11;
                                    if (i25 > 0 || i26 <= 0) {
                                        str2 = ", density: ";
                                        aVar2 = aVar4;
                                        str3 = ", target density: ";
                                        i17 = i14;
                                        if (Log.isLoggable("Downsampler", 3)) {
                                            Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeY + " with target [" + i17 + "x" + i15 + "]");
                                        }
                                    } else {
                                        if (i12 == 90 || i12 == 270) {
                                            i22 = i26;
                                            i23 = i25;
                                        } else {
                                            i23 = i26;
                                            i22 = i25;
                                        }
                                        i17 = i14;
                                        float fB = mVar.b(i22, i23, i17, i15);
                                        if (fB <= 0.0f) {
                                            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + mVar + ", source: [" + i25 + "x" + i26 + "], target: [" + i17 + "x" + i15 + "]");
                                        }
                                        int iA = mVar.a(i22, i23, i17, i15);
                                        if (iA == 0) {
                                            throw new IllegalArgumentException("Cannot round with null rounding");
                                        }
                                        int i28 = i12;
                                        float f11 = i22;
                                        int i29 = i22;
                                        float f12 = i23;
                                        int i30 = i23;
                                        int i31 = (int) (((double) (fB * f12)) + 0.5d);
                                        int i32 = i29 / ((int) (((double) (fB * f11)) + 0.5d));
                                        int i33 = i30 / i31;
                                        int iMax = Math.max(1, Integer.highestOneBit(iA == 1 ? Math.max(i32, i33) : Math.min(i32, i33)));
                                        if (iA == 1 && iMax < 1.0f / fB) {
                                            iMax <<= 1;
                                        }
                                        options.inSampleSize = iMax;
                                        if (imageHeaderParser$ImageTypeY == ImageHeaderParser$ImageType.JPEG) {
                                            float fMin = Math.min(iMax, 8);
                                            iFloor = (int) Math.ceil(f11 / fMin);
                                            iFloor2 = (int) Math.ceil(f12 / fMin);
                                            int i34 = iMax / 8;
                                            if (i34 > 0) {
                                                iFloor2 /= i34;
                                                iRound3 = iFloor / i34;
                                            } else {
                                                iRound3 = iFloor;
                                            }
                                        } else {
                                            if (imageHeaderParser$ImageTypeY == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeY == ImageHeaderParser$ImageType.PNG_A) {
                                                float f13 = iMax;
                                                iFloor = (int) Math.floor(f11 / f13);
                                                iFloor2 = (int) Math.floor(f12 / f13);
                                            } else if (imageHeaderParser$ImageTypeY.isWebp()) {
                                                float f14 = iMax;
                                                iRound3 = Math.round(f11 / f14);
                                                iFloor2 = Math.round(f12 / f14);
                                            } else if (i29 % iMax == 0 && i30 % iMax == 0) {
                                                iRound3 = i29 / iMax;
                                                iFloor2 = i30 / iMax;
                                            } else {
                                                options.inJustDecodeBounds = true;
                                                c(lVar, options, nVar, aVar4);
                                                options.inJustDecodeBounds = false;
                                                int[] iArr2 = {options.outWidth, options.outHeight};
                                                iFloor = iArr2[0];
                                                iFloor2 = iArr2[1];
                                            }
                                            iRound3 = iFloor;
                                        }
                                        double dB = mVar.b(iRound3, iFloor2, i17, i15);
                                        int iRound4 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
                                        aVar2 = aVar4;
                                        int i35 = (int) ((((double) iRound4) * dB) + 0.5d);
                                        float f15 = i35 / iRound4;
                                        int i36 = iMax;
                                        options.inTargetDensity = (int) (((dB / ((double) f15)) * ((double) i35)) + 0.5d);
                                        int iRound5 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
                                        options.inDensity = iRound5;
                                        int i37 = options.inTargetDensity;
                                        if (i37 <= 0 || iRound5 <= 0 || i37 == iRound5) {
                                            options.inTargetDensity = 0;
                                            options.inDensity = 0;
                                        } else {
                                            options.inScaled = true;
                                        }
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            StringBuilder sbD = u3.b.d(i25, i26, "Calculate scaling, source: [", "x", "], degreesToRotate: ");
                                            sbD.append(i28);
                                            sbD.append(", target: [");
                                            sbD.append(i17);
                                            sbD.append("x");
                                            sbD.append(i15);
                                            sbD.append("], power of two scaled: [");
                                            sbD.append(iRound3);
                                            sbD.append("x");
                                            sbD.append(iFloor2);
                                            sbD.append("], exact scale factor: ");
                                            sbD.append(fB);
                                            sbD.append(", power of 2 sample size: ");
                                            sbD.append(i36);
                                            sbD.append(", adjusted scale factor: ");
                                            sbD.append(dB);
                                            str3 = ", target density: ";
                                            sbD.append(str3);
                                            sbD.append(options.inTargetDensity);
                                            str2 = ", density: ";
                                            sbD.append(str2);
                                            sbD.append(options.inDensity);
                                            Log.v("Downsampler", sbD.toString());
                                        } else {
                                            str2 = r7;
                                            str3 = ", target density: ";
                                        }
                                    }
                                    zC = this.e.c(i17, i15, z16, z17);
                                    if (zC) {
                                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                        z12 = false;
                                        options.inMutable = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (zC) {
                                        if (aVar != u3.a.f8842a) {
                                            try {
                                                zHasAlpha = lVar.y().hasAlpha();
                                            } catch (IOException e) {
                                                if (Log.isLoggable("Downsampler", 3)) {
                                                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + aVar, e);
                                                }
                                                zHasAlpha = z12;
                                            }
                                            if (zHasAlpha) {
                                                config = Bitmap.Config.ARGB_8888;
                                            } else {
                                                config = Bitmap.Config.RGB_565;
                                            }
                                            options.inPreferredConfig = config;
                                            if (config == Bitmap.Config.RGB_565) {
                                                z13 = true;
                                                options.inDither = true;
                                            } else {
                                                z13 = true;
                                            }
                                        } else {
                                            z13 = true;
                                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        }
                                        break;
                                    } else {
                                        z13 = true;
                                    }
                                    i18 = Build.VERSION.SDK_INT;
                                    if (i25 >= 0 || i26 < 0 || !z10) {
                                        i19 = options.inTargetDensity;
                                        if (i19 > 0 || (i21 = options.inDensity) <= 0 || i19 == i21) {
                                            z14 = z12;
                                        } else {
                                            z14 = z13;
                                        }
                                        if (z14) {
                                            f10 = i19 / options.inDensity;
                                        } else {
                                            f10 = 1.0f;
                                        }
                                        i20 = options.inSampleSize;
                                        float f16 = i20;
                                        int iCeil = (int) Math.ceil(i25 / f16);
                                        int iCeil2 = (int) Math.ceil(i26 / f16);
                                        iRound = Math.round(iCeil * f10);
                                        iRound2 = Math.round(iCeil2 * f10);
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            StringBuilder sbD2 = u3.b.d(iRound, iRound2, "Calculated target [", "x", "] for source [");
                                            sbD2.append(i25);
                                            sbD2.append("x");
                                            sbD2.append(i26);
                                            sbD2.append("], sampleSize: ");
                                            sbD2.append(i20);
                                            sbD2.append(", targetDensity: ");
                                            sbD2.append(options.inTargetDensity);
                                            sbD2.append(str2);
                                            sbD2.append(options.inDensity);
                                            sbD2.append(", density multiplier: ");
                                            sbD2.append(f10);
                                            Log.v("Downsampler", sbD2.toString());
                                        }
                                        i15 = iRound2;
                                    } else {
                                        iRound = i17;
                                    }
                                    if (iRound > 0 || i15 <= 0) {
                                        aVar3 = aVar2;
                                    } else {
                                        if (i18 < 26) {
                                            config3 = null;
                                        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
                                            aVar3 = aVar2;
                                        } else {
                                            config3 = options.outConfig;
                                        }
                                        if (config3 == null) {
                                            config3 = options.inPreferredConfig;
                                        }
                                        aVar3 = aVar2;
                                        options.inBitmap = aVar3.a(iRound, i15, config3);
                                    }
                                    if (jVar != null) {
                                        if (i18 >= 28) {
                                            if (jVar == u3.j.f8853a || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) {
                                                z15 = false;
                                            } else {
                                                z15 = true;
                                            }
                                            if (z15) {
                                                named = ColorSpace.Named.DISPLAY_P3;
                                            } else {
                                                named = ColorSpace.Named.SRGB;
                                            }
                                            options.inPreferredColorSpace = ColorSpace.get(named);
                                        } else if (i18 >= 26) {
                                            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                                        }
                                    }
                                    bitmapC = c(lVar, options, nVar, aVar3);
                                    nVar.a(bitmapC, aVar3);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                        Log.v("Downsampler", "Decoded " + d(bitmapC) + " from [" + i25 + "x" + i26 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i10 + "x" + i11 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + p4.h.a(j4));
                                    }
                                    if (bitmapC != null) {
                                        return null;
                                    }
                                    bitmapC.setDensity(this.f2893b.densityDpi);
                                    switch (i16) {
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            matrix = new Matrix();
                                            switch (i16) {
                                                case 2:
                                                    matrix.setScale(-1.0f, 1.0f);
                                                    break;
                                                case 3:
                                                    matrix.setRotate(180.0f);
                                                    break;
                                                case 4:
                                                    matrix.setRotate(180.0f);
                                                    matrix.postScale(-1.0f, 1.0f);
                                                    break;
                                                case 5:
                                                    matrix.setRotate(90.0f);
                                                    matrix.postScale(-1.0f, 1.0f);
                                                    break;
                                                case 6:
                                                    matrix.setRotate(90.0f);
                                                    break;
                                                case 7:
                                                    matrix.setRotate(-90.0f);
                                                    matrix.postScale(-1.0f, 1.0f);
                                                    break;
                                                case 8:
                                                    matrix.setRotate(-90.0f);
                                                    break;
                                            }
                                            RectF rectF = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
                                            matrix.mapRect(rectF);
                                            int iRound6 = Math.round(rectF.width());
                                            int iRound7 = Math.round(rectF.height());
                                            if (bitmapC.getConfig() != null) {
                                                config2 = bitmapC.getConfig();
                                            } else {
                                                config2 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapH = aVar3.h(iRound6, iRound7, config2);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            bitmapH.setHasAlpha(bitmapC.hasAlpha());
                                            y.a(bitmapC, bitmapH, matrix);
                                            break;
                                        default:
                                            bitmapH = bitmapC;
                                            break;
                                    }
                                    if (!bitmapC.equals(bitmapH)) {
                                        aVar3.c(bitmapC);
                                    }
                                    return bitmapH;
                                }
                                i27++;
                                list = list2;
                                fVar = fVar2;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                iO = -1;
                switch (iO) {
                    case 3:
                    case 4:
                        i12 = 180;
                        break;
                    case 5:
                    case 6:
                        i12 = 90;
                        break;
                    case 7:
                    case 8:
                        i12 = 270;
                        break;
                    default:
                        i12 = 0;
                        break;
                }
                switch (iO) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        z11 = true;
                        break;
                    default:
                        z11 = false;
                        break;
                }
                if (i10 == Integer.MIN_VALUE) {
                    if (i12 != 90) {
                        i13 = 270;
                        if (i12 == 270) {
                            i14 = i25;
                        }
                    } else {
                        i13 = 270;
                    }
                    i14 = i26;
                } else {
                    i13 = 270;
                    i14 = i10;
                }
                if (i11 == Integer.MIN_VALUE) {
                    i15 = i11;
                } else if (i12 != 90) {
                    i15 = i25;
                } else {
                    i15 = i25;
                }
                imageHeaderParser$ImageTypeY = lVar.y();
                i16 = iO;
                boolean z18 = z11;
                if (i25 > 0) {
                    str2 = ", density: ";
                    aVar2 = aVar4;
                    str3 = ", target density: ";
                    i17 = i14;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeY + " with target [" + i17 + "x" + i15 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    aVar2 = aVar4;
                    str3 = ", target density: ";
                    i17 = i14;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeY + " with target [" + i17 + "x" + i15 + "]");
                    }
                }
                zC = this.e.c(i17, i15, z16, z18);
                if (zC) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z12 = false;
                    options.inMutable = false;
                } else {
                    z12 = false;
                }
                if (zC) {
                    z13 = true;
                } else if (aVar != u3.a.f8842a) {
                    zHasAlpha = lVar.y().hasAlpha();
                    if (zHasAlpha) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    options.inPreferredConfig = config;
                    if (config == Bitmap.Config.RGB_565) {
                        z13 = true;
                        options.inDither = true;
                    } else {
                        z13 = true;
                    }
                } else {
                    z13 = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                i18 = Build.VERSION.SDK_INT;
                if (i25 >= 0) {
                    i19 = options.inTargetDensity;
                    if (i19 > 0) {
                        z14 = z12;
                    } else {
                        z14 = z12;
                    }
                    if (z14) {
                        f10 = i19 / options.inDensity;
                    } else {
                        f10 = 1.0f;
                    }
                    i20 = options.inSampleSize;
                    float f17 = i20;
                    int iCeil3 = (int) Math.ceil(i25 / f17);
                    int iCeil4 = (int) Math.ceil(i26 / f17);
                    iRound = Math.round(iCeil3 * f10);
                    iRound2 = Math.round(iCeil4 * f10);
                    if (Log.isLoggable("Downsampler", 2)) {
                        StringBuilder sbD3 = u3.b.d(iRound, iRound2, "Calculated target [", "x", "] for source [");
                        sbD3.append(i25);
                        sbD3.append("x");
                        sbD3.append(i26);
                        sbD3.append("], sampleSize: ");
                        sbD3.append(i20);
                        sbD3.append(", targetDensity: ");
                        sbD3.append(options.inTargetDensity);
                        sbD3.append(str2);
                        sbD3.append(options.inDensity);
                        sbD3.append(", density multiplier: ");
                        sbD3.append(f10);
                        Log.v("Downsampler", sbD3.toString());
                    }
                    i15 = iRound2;
                } else {
                    i19 = options.inTargetDensity;
                    if (i19 > 0) {
                        z14 = z12;
                    } else {
                        z14 = z12;
                    }
                    if (z14) {
                        f10 = i19 / options.inDensity;
                    } else {
                        f10 = 1.0f;
                    }
                    i20 = options.inSampleSize;
                    float f18 = i20;
                    int iCeil5 = (int) Math.ceil(i25 / f18);
                    int iCeil6 = (int) Math.ceil(i26 / f18);
                    iRound = Math.round(iCeil5 * f10);
                    iRound2 = Math.round(iCeil6 * f10);
                    if (Log.isLoggable("Downsampler", 2)) {
                        StringBuilder sbD4 = u3.b.d(iRound, iRound2, "Calculated target [", "x", "] for source [");
                        sbD4.append(i25);
                        sbD4.append("x");
                        sbD4.append(i26);
                        sbD4.append("], sampleSize: ");
                        sbD4.append(i20);
                        sbD4.append(", targetDensity: ");
                        sbD4.append(options.inTargetDensity);
                        sbD4.append(str2);
                        sbD4.append(options.inDensity);
                        sbD4.append(", density multiplier: ");
                        sbD4.append(f10);
                        Log.v("Downsampler", sbD4.toString());
                    }
                    i15 = iRound2;
                }
                if (iRound > 0) {
                    aVar3 = aVar2;
                } else {
                    aVar3 = aVar2;
                }
                if (jVar != null) {
                    if (i18 >= 28) {
                        if (jVar == u3.j.f8853a) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            named = ColorSpace.Named.DISPLAY_P3;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else if (i18 >= 26) {
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapC = c(lVar, options, nVar, aVar3);
                nVar.a(bitmapC, aVar3);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + d(bitmapC) + " from [" + i25 + "x" + i26 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i10 + "x" + i11 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + p4.h.a(j4));
                }
                if (bitmapC != null) {
                    return null;
                }
                bitmapC.setDensity(this.f2893b.densityDpi);
                switch (i16) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (i16) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF2 = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
                        matrix.mapRect(rectF2);
                        int iRound8 = Math.round(rectF2.width());
                        int iRound9 = Math.round(rectF2.height());
                        if (bitmapC.getConfig() != null) {
                            config2 = bitmapC.getConfig();
                        } else {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                        bitmapH = aVar3.h(iRound8, iRound9, config2);
                        matrix.postTranslate(-rectF2.left, -rectF2.top);
                        bitmapH.setHasAlpha(bitmapC.hasAlpha());
                        y.a(bitmapC, bitmapH, matrix);
                        break;
                    default:
                        bitmapH = bitmapC;
                        break;
                }
                if (!bitmapC.equals(bitmapH)) {
                    aVar3.c(bitmapC);
                }
                return bitmapH;
            case 9:
                j4 = jElapsedRealtimeNanos;
                str = str4;
                List list3 = (List) lVar.f45d;
                w wVar2 = (w) ((com.bumptech.glide.load.data.i) lVar.f43b).f1900b;
                wVar2.reset();
                iO = n9.b.o(list3, wVar2, (x3.f) lVar.f44c);
                switch (iO) {
                    case 3:
                    case 4:
                        i12 = 180;
                        break;
                    case 5:
                    case 6:
                        i12 = 90;
                        break;
                    case 7:
                    case 8:
                        i12 = 270;
                        break;
                    default:
                        i12 = 0;
                        break;
                }
                switch (iO) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        z11 = true;
                        break;
                    default:
                        z11 = false;
                        break;
                }
                if (i10 == Integer.MIN_VALUE) {
                    if (i12 != 90) {
                        i13 = 270;
                        if (i12 == 270) {
                            i14 = i25;
                        }
                    } else {
                        i13 = 270;
                    }
                    i14 = i26;
                } else {
                    i13 = 270;
                    i14 = i10;
                }
                if (i11 == Integer.MIN_VALUE) {
                    i15 = i11;
                } else if (i12 != 90) {
                    i15 = i25;
                } else {
                    i15 = i25;
                }
                imageHeaderParser$ImageTypeY = lVar.y();
                i16 = iO;
                boolean z19 = z11;
                if (i25 > 0) {
                    str2 = ", density: ";
                    aVar2 = aVar4;
                    str3 = ", target density: ";
                    i17 = i14;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeY + " with target [" + i17 + "x" + i15 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    aVar2 = aVar4;
                    str3 = ", target density: ";
                    i17 = i14;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeY + " with target [" + i17 + "x" + i15 + "]");
                    }
                }
                zC = this.e.c(i17, i15, z16, z19);
                if (zC) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z12 = false;
                    options.inMutable = false;
                } else {
                    z12 = false;
                }
                if (zC) {
                    z13 = true;
                } else if (aVar != u3.a.f8842a) {
                    zHasAlpha = lVar.y().hasAlpha();
                    if (zHasAlpha) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    options.inPreferredConfig = config;
                    if (config == Bitmap.Config.RGB_565) {
                        z13 = true;
                        options.inDither = true;
                    } else {
                        z13 = true;
                    }
                } else {
                    z13 = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                i18 = Build.VERSION.SDK_INT;
                if (i25 >= 0) {
                    i19 = options.inTargetDensity;
                    if (i19 > 0) {
                        z14 = z12;
                    } else {
                        z14 = z12;
                    }
                    if (z14) {
                        f10 = i19 / options.inDensity;
                    } else {
                        f10 = 1.0f;
                    }
                    i20 = options.inSampleSize;
                    float f19 = i20;
                    int iCeil7 = (int) Math.ceil(i25 / f19);
                    int iCeil8 = (int) Math.ceil(i26 / f19);
                    iRound = Math.round(iCeil7 * f10);
                    iRound2 = Math.round(iCeil8 * f10);
                    if (Log.isLoggable("Downsampler", 2)) {
                        StringBuilder sbD5 = u3.b.d(iRound, iRound2, "Calculated target [", "x", "] for source [");
                        sbD5.append(i25);
                        sbD5.append("x");
                        sbD5.append(i26);
                        sbD5.append("], sampleSize: ");
                        sbD5.append(i20);
                        sbD5.append(", targetDensity: ");
                        sbD5.append(options.inTargetDensity);
                        sbD5.append(str2);
                        sbD5.append(options.inDensity);
                        sbD5.append(", density multiplier: ");
                        sbD5.append(f10);
                        Log.v("Downsampler", sbD5.toString());
                    }
                    i15 = iRound2;
                } else {
                    i19 = options.inTargetDensity;
                    if (i19 > 0) {
                        z14 = z12;
                    } else {
                        z14 = z12;
                    }
                    if (z14) {
                        f10 = i19 / options.inDensity;
                    } else {
                        f10 = 1.0f;
                    }
                    i20 = options.inSampleSize;
                    float f110 = i20;
                    int iCeil9 = (int) Math.ceil(i25 / f110);
                    int iCeil10 = (int) Math.ceil(i26 / f110);
                    iRound = Math.round(iCeil9 * f10);
                    iRound2 = Math.round(iCeil10 * f10);
                    if (Log.isLoggable("Downsampler", 2)) {
                        StringBuilder sbD6 = u3.b.d(iRound, iRound2, "Calculated target [", "x", "] for source [");
                        sbD6.append(i25);
                        sbD6.append("x");
                        sbD6.append(i26);
                        sbD6.append("], sampleSize: ");
                        sbD6.append(i20);
                        sbD6.append(", targetDensity: ");
                        sbD6.append(options.inTargetDensity);
                        sbD6.append(str2);
                        sbD6.append(options.inDensity);
                        sbD6.append(", density multiplier: ");
                        sbD6.append(f10);
                        Log.v("Downsampler", sbD6.toString());
                    }
                    i15 = iRound2;
                }
                if (iRound > 0) {
                    aVar3 = aVar2;
                } else {
                    aVar3 = aVar2;
                }
                if (jVar != null) {
                    if (i18 >= 28) {
                        if (jVar == u3.j.f8853a) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            named = ColorSpace.Named.DISPLAY_P3;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else if (i18 >= 26) {
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapC = c(lVar, options, nVar, aVar3);
                nVar.a(bitmapC, aVar3);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + d(bitmapC) + " from [" + i25 + "x" + i26 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i10 + "x" + i11 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + p4.h.a(j4));
                }
                if (bitmapC != null) {
                    return null;
                }
                bitmapC.setDensity(this.f2893b.densityDpi);
                switch (i16) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (i16) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF3 = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
                        matrix.mapRect(rectF3);
                        int iRound10 = Math.round(rectF3.width());
                        int iRound11 = Math.round(rectF3.height());
                        if (bitmapC.getConfig() != null) {
                            config2 = bitmapC.getConfig();
                        } else {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                        bitmapH = aVar3.h(iRound10, iRound11, config2);
                        matrix.postTranslate(-rectF3.left, -rectF3.top);
                        bitmapH.setHasAlpha(bitmapC.hasAlpha());
                        y.a(bitmapC, bitmapH, matrix);
                        break;
                    default:
                        bitmapH = bitmapC;
                        break;
                }
                if (!bitmapC.equals(bitmapH)) {
                    aVar3.c(bitmapC);
                }
                return bitmapH;
            default:
                List list4 = (List) lVar.f44c;
                j4 = jElapsedRealtimeNanos;
                com.bumptech.glide.load.data.i iVar = (com.bumptech.glide.load.data.i) lVar.f45d;
                x3.f fVar3 = (x3.f) lVar.f43b;
                int size2 = list4.size();
                str = str4;
                int i38 = 0;
                while (true) {
                    if (i38 < size2) {
                        int i39 = size2;
                        u3.e eVar = (u3.e) list4.get(i38);
                        int i40 = i38;
                        try {
                            List list5 = list4;
                            w wVar3 = new w(new FileInputStream(iVar.d().getFileDescriptor()), fVar3);
                            try {
                                iB = eVar.c(wVar3, fVar3);
                                wVar3.d();
                                iVar.d();
                                if (iB != -1) {
                                    iO = iB;
                                } else {
                                    i38 = i40 + 1;
                                    size2 = i39;
                                    list4 = list5;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                wVar = wVar3;
                                if (wVar != null) {
                                    wVar.d();
                                }
                                iVar.d();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        iO = -1;
                    }
                }
                switch (iO) {
                    case 3:
                    case 4:
                        i12 = 180;
                        break;
                    case 5:
                    case 6:
                        i12 = 90;
                        break;
                    case 7:
                    case 8:
                        i12 = 270;
                        break;
                    default:
                        i12 = 0;
                        break;
                }
                switch (iO) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        z11 = true;
                        break;
                    default:
                        z11 = false;
                        break;
                }
                if (i10 == Integer.MIN_VALUE) {
                    if (i12 != 90) {
                        i13 = 270;
                        if (i12 == 270) {
                            i14 = i25;
                        }
                    } else {
                        i13 = 270;
                    }
                    i14 = i26;
                } else {
                    i13 = 270;
                    i14 = i10;
                }
                if (i11 == Integer.MIN_VALUE) {
                    i15 = i11;
                } else if (i12 != 90) {
                    i15 = i25;
                } else {
                    i15 = i25;
                }
                imageHeaderParser$ImageTypeY = lVar.y();
                i16 = iO;
                boolean z110 = z11;
                if (i25 > 0) {
                    str2 = ", density: ";
                    aVar2 = aVar4;
                    str3 = ", target density: ";
                    i17 = i14;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeY + " with target [" + i17 + "x" + i15 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    aVar2 = aVar4;
                    str3 = ", target density: ";
                    i17 = i14;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeY + " with target [" + i17 + "x" + i15 + "]");
                    }
                }
                zC = this.e.c(i17, i15, z16, z110);
                if (zC) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z12 = false;
                    options.inMutable = false;
                } else {
                    z12 = false;
                }
                if (zC) {
                    z13 = true;
                } else if (aVar != u3.a.f8842a) {
                    zHasAlpha = lVar.y().hasAlpha();
                    if (zHasAlpha) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    options.inPreferredConfig = config;
                    if (config == Bitmap.Config.RGB_565) {
                        z13 = true;
                        options.inDither = true;
                    } else {
                        z13 = true;
                    }
                } else {
                    z13 = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                i18 = Build.VERSION.SDK_INT;
                if (i25 >= 0) {
                    i19 = options.inTargetDensity;
                    if (i19 > 0) {
                        z14 = z12;
                    } else {
                        z14 = z12;
                    }
                    if (z14) {
                        f10 = i19 / options.inDensity;
                    } else {
                        f10 = 1.0f;
                    }
                    i20 = options.inSampleSize;
                    float f111 = i20;
                    int iCeil11 = (int) Math.ceil(i25 / f111);
                    int iCeil12 = (int) Math.ceil(i26 / f111);
                    iRound = Math.round(iCeil11 * f10);
                    iRound2 = Math.round(iCeil12 * f10);
                    if (Log.isLoggable("Downsampler", 2)) {
                        StringBuilder sbD7 = u3.b.d(iRound, iRound2, "Calculated target [", "x", "] for source [");
                        sbD7.append(i25);
                        sbD7.append("x");
                        sbD7.append(i26);
                        sbD7.append("], sampleSize: ");
                        sbD7.append(i20);
                        sbD7.append(", targetDensity: ");
                        sbD7.append(options.inTargetDensity);
                        sbD7.append(str2);
                        sbD7.append(options.inDensity);
                        sbD7.append(", density multiplier: ");
                        sbD7.append(f10);
                        Log.v("Downsampler", sbD7.toString());
                    }
                    i15 = iRound2;
                } else {
                    i19 = options.inTargetDensity;
                    if (i19 > 0) {
                        z14 = z12;
                    } else {
                        z14 = z12;
                    }
                    if (z14) {
                        f10 = i19 / options.inDensity;
                    } else {
                        f10 = 1.0f;
                    }
                    i20 = options.inSampleSize;
                    float f112 = i20;
                    int iCeil13 = (int) Math.ceil(i25 / f112);
                    int iCeil14 = (int) Math.ceil(i26 / f112);
                    iRound = Math.round(iCeil13 * f10);
                    iRound2 = Math.round(iCeil14 * f10);
                    if (Log.isLoggable("Downsampler", 2)) {
                        StringBuilder sbD8 = u3.b.d(iRound, iRound2, "Calculated target [", "x", "] for source [");
                        sbD8.append(i25);
                        sbD8.append("x");
                        sbD8.append(i26);
                        sbD8.append("], sampleSize: ");
                        sbD8.append(i20);
                        sbD8.append(", targetDensity: ");
                        sbD8.append(options.inTargetDensity);
                        sbD8.append(str2);
                        sbD8.append(options.inDensity);
                        sbD8.append(", density multiplier: ");
                        sbD8.append(f10);
                        Log.v("Downsampler", sbD8.toString());
                    }
                    i15 = iRound2;
                }
                if (iRound > 0) {
                    aVar3 = aVar2;
                } else {
                    aVar3 = aVar2;
                }
                if (jVar != null) {
                    if (i18 >= 28) {
                        if (jVar == u3.j.f8853a) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            named = ColorSpace.Named.DISPLAY_P3;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else if (i18 >= 26) {
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapC = c(lVar, options, nVar, aVar3);
                nVar.a(bitmapC, aVar3);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + d(bitmapC) + " from [" + i25 + "x" + i26 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i10 + "x" + i11 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + p4.h.a(j4));
                }
                if (bitmapC != null) {
                    return null;
                }
                bitmapC.setDensity(this.f2893b.densityDpi);
                switch (i16) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (i16) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF4 = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
                        matrix.mapRect(rectF4);
                        int iRound12 = Math.round(rectF4.width());
                        int iRound13 = Math.round(rectF4.height());
                        if (bitmapC.getConfig() != null) {
                            config2 = bitmapC.getConfig();
                        } else {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                        bitmapH = aVar3.h(iRound12, iRound13, config2);
                        matrix.postTranslate(-rectF4.left, -rectF4.top);
                        bitmapH.setHasAlpha(bitmapC.hasAlpha());
                        y.a(bitmapC, bitmapH, matrix);
                        break;
                    default:
                        bitmapH = bitmapC;
                        break;
                }
                if (!bitmapC.equals(bitmapH)) {
                    aVar3.c(bitmapC);
                }
                return bitmapH;
        }
    }
}
