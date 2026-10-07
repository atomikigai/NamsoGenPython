package h1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import da.v;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final d G;
    public static final d[][] H;
    public static final d[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final HashSet L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileDescriptor f4599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f4600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap[] f4602d;
    public final HashSet e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteOrder f4603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4604g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f4584l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List f4585m = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f4586n = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f4587o = {8, 8, 8};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f4588p = {8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f4589q = {-1, -40, -1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f4590r = {102, 116, 121, 112};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f4591s = {109, 105, 102, 49};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f4592t = {104, 101, 105, 99};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f4593u = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f4594v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f4595w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f4596x = {101, 88, 73, 102};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f4597y = {73, 72, 68, 82};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f4598z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, "ImageWidth", 4), new d(257, 3, "ImageLength", 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, "StripOffsets", 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, "RowsPerStrip", 4), new d(279, 3, "StripByteCounts", 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, "PixelXDimension", 4), new d(40963, 3, "PixelYDimension", 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, "DefaultCropSize", 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, "GPSLatitude", 10), new d("GPSLongitudeRef", 3, 2), new d(4, 5, "GPSLongitude", 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, "ThumbnailImageWidth", 4), new d(257, 3, "ThumbnailImageLength", 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, "StripOffsets", 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, "RowsPerStrip", 4), new d(279, 3, "StripByteCounts", 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, "DefaultCropSize", 4)};
        G = new d("StripOffsets", 273, 3);
        H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        N = charsetForName;
        O = "Exif\u0000\u0000".getBytes(charsetForName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            d[][] dVarArr6 = H;
            if (i >= dVarArr6.length) {
                HashMap map = M;
                d[] dVarArr7 = I;
                map.put(Integer.valueOf(dVarArr7[0].f4578a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f4578a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f4578a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f4578a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f4578a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f4578a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            J[i] = new HashMap();
            K[i] = new HashMap();
            for (d dVar : dVarArr6[i]) {
                J[i].put(Integer.valueOf(dVar.f4578a), dVar);
                K[i].put(dVar.f4579b, dVar);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public g(InputStream inputStream) throws IOException {
        d[][] dVarArr = H;
        this.f4602d = new HashMap[dVarArr.length];
        this.e = new HashSet(dVarArr.length);
        this.f4603f = ByteOrder.BIG_ENDIAN;
        boolean z4 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z10 = f4584l;
        if (z4) {
            this.f4600b = (AssetManager.AssetInputStream) inputStream;
            this.f4599a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f4600b = null;
                this.f4599a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z10) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f4600b = null;
                this.f4599a = null;
            }
        } else {
            this.f4600b = null;
            this.f4599a = null;
        }
        for (int i = 0; i < dVarArr.length; i++) {
            try {
                try {
                    this.f4602d[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z10) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z10) {
                    return;
                }
            } catch (UnsupportedOperationException e4) {
                e = e4;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z10) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iF = f(bufferedInputStream);
        this.f4601c = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            b bVar = new b(bufferedInputStream);
            int i10 = this.f4601c;
            if (i10 == 4) {
                e(bVar, 0, 0);
            } else if (i10 == 13) {
                h(bVar);
            } else if (i10 == 9) {
                i(bVar);
            } else if (i10 == 14) {
                l(bVar);
            }
        } else {
            f fVar = new f(bufferedInputStream);
            int i11 = this.f4601c;
            if (i11 == 12) {
                d(fVar);
            } else if (i11 == 7) {
                g(fVar);
            } else if (i11 == 10) {
                k(fVar);
            } else {
                j(fVar);
            }
            fVar.d(this.h);
            u(fVar);
        }
        a();
        if (!z10) {
            return;
        }
        p();
    }

    public static ByteOrder q(b bVar) throws IOException {
        short s10 = bVar.readShort();
        boolean z4 = f4584l;
        if (s10 == 18761) {
            if (z4) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (z4) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f4602d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(N);
            map.put("DateTime", new c(2, bytes, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f4603f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f4603f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f4603f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f4603f));
        }
    }

    public final String b(String str) {
        c cVarC = c(str);
        if (cVarC != null) {
            int i = cVarC.f4574a;
            if (!L.contains(str)) {
                return cVarC.f(this.f4603f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                e[] eVarArr = (e[]) cVarC.g(this.f4603f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f4582a / eVar.f4583b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f4582a / eVar2.f4583b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f4582a / eVar3.f4583b)));
            }
            try {
                return Double.toString(cVarC.d(this.f4603f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f4584l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < H.length; i++) {
            c cVar = (c) this.f4602d[i].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f4602d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f4603f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata2), this.f4603f));
                }
                if (strExtractMetadata3 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata3);
                    if (i10 == 90) {
                        i = 6;
                    } else if (i10 != 180) {
                        i = i10 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", c.c(i, this.f4603f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata4);
                    int i12 = Integer.parseInt(strExtractMetadata5);
                    if (i12 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.d(i11);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i13 = i11 + 6;
                    int i14 = i12 - 6;
                    if (!Arrays.equals(bArr, O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i14];
                    if (fVar.read(bArr2) != i14) {
                        throw new IOException("Can't read exif");
                    }
                    this.h = i13;
                    r(0, bArr2);
                }
                if (f4584l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146 A[LOOP:2: B:69:0x013c->B:74:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e(h1.b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.e(h1.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x014d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0156 A[LOOP:2: B:113:0x0148->B:118:0x0156, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x015c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x015f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0166  */
    /* JADX WARN: Code duplicated, block: B:129:0x016f A[LOOP:3: B:124:0x0161->B:129:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x0179  */
    /* JADX WARN: Code duplicated, block: B:136:0x0183 A[LOOP:4: B:131:0x0174->B:136:0x0183, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x0188 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:140:0x018b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x016c A[EDGE_INSN: B:171:0x016c->B:128:0x016c BREAK  A[LOOP:3: B:124:0x0161->B:129:0x016f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0186 A[EDGE_INSN: B:172:0x0186->B:137:0x0186 BREAK  A[LOOP:4: B:131:0x0174->B:136:0x0183], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x016c A[EDGE_INSN: B:173:0x016c->B:128:0x016c BREAK  A[LOOP:3: B:124:0x0161->B:129:0x016f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        int i;
        b bVar2;
        b bVar3;
        b bVar4;
        int i10;
        b bVar5;
        b bVar6;
        int i11;
        int i12;
        byte[] bArr;
        int i13;
        int i14;
        byte[] bArr2;
        int i15;
        byte[] bArr3;
        b bVar7;
        short s10;
        long j4;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i16 = 0;
        while (true) {
            byte[] bArr5 = f4589q;
            if (i16 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i16] != bArr5[i16]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i17 = 0; i17 < bytes.length; i17++) {
                    if (bArr4[i17] != bytes[i17]) {
                        int i18 = 1;
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                try {
                                    long j10 = bVar2.readInt();
                                    byte[] bArr6 = new byte[4];
                                    bVar2.read(bArr6);
                                    try {
                                        try {
                                            if (Arrays.equals(bArr6, f4590r)) {
                                                if (j10 == 1) {
                                                    j10 = bVar2.readLong();
                                                    j4 = 16;
                                                    if (j10 < 16) {
                                                    }
                                                    bVar4 = new b(bArr4);
                                                    ByteOrder byteOrderQ = q(bVar4);
                                                    this.f4603f = byteOrderQ;
                                                    bVar4.f4571b = byteOrderQ;
                                                    s10 = bVar4.readShort();
                                                    if (s10 != 20306 || s10 == 21330) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i;
                                                    }
                                                    bVar4.close();
                                                    if (i10 != 0) {
                                                        return 7;
                                                    }
                                                    try {
                                                        bVar7 = new b(bArr4);
                                                        try {
                                                            ByteOrder byteOrderQ2 = q(bVar7);
                                                            this.f4603f = byteOrderQ2;
                                                            bVar7.f4571b = byteOrderQ2;
                                                            if (bVar7.readShort() == 85) {
                                                                i11 = 1;
                                                            } else {
                                                                i11 = i;
                                                            }
                                                            bVar7.close();
                                                        } catch (Exception unused) {
                                                            bVar6 = bVar7;
                                                            if (bVar6 != null) {
                                                                bVar6.close();
                                                            }
                                                            i11 = i;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            bVar5 = bVar7;
                                                            if (bVar5 != null) {
                                                                bVar5.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused2) {
                                                        bVar6 = null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        bVar5 = null;
                                                    }
                                                    if (i11 != 0) {
                                                        return 10;
                                                    }
                                                    i12 = i;
                                                    while (true) {
                                                        bArr = f4595w;
                                                        if (i12 < bArr.length) {
                                                            i13 = 1;
                                                            break;
                                                        }
                                                        if (bArr4[i12] != bArr[i12]) {
                                                            i13 = i;
                                                            break;
                                                        }
                                                        i12++;
                                                    }
                                                    if (i13 != 0) {
                                                        return 13;
                                                    }
                                                    i14 = i;
                                                    while (true) {
                                                        bArr2 = A;
                                                        if (i14 < bArr2.length) {
                                                            i15 = i;
                                                            while (true) {
                                                                bArr3 = B;
                                                                if (i15 >= bArr3.length) {
                                                                    break;
                                                                }
                                                                if (bArr4[bArr2.length + i15 + 4] != bArr3[i15]) {
                                                                    break;
                                                                }
                                                                i15++;
                                                            }
                                                            if (i18 != 0) {
                                                                return 14;
                                                            }
                                                            return i;
                                                        }
                                                        if (bArr4[i14] != bArr2[i14]) {
                                                            break;
                                                        }
                                                        i14++;
                                                    }
                                                    i18 = i;
                                                    if (i18 != 0) {
                                                        return 14;
                                                    }
                                                    return i;
                                                }
                                                j4 = 8;
                                                i = 0;
                                                long j11 = 5000;
                                                if (j10 > j11) {
                                                    j10 = j11;
                                                }
                                                long j12 = j10 - j4;
                                                if (j12 >= 8) {
                                                    try {
                                                        byte[] bArr7 = new byte[4];
                                                        boolean z4 = false;
                                                        boolean z10 = false;
                                                        for (long j13 = 0; j13 < j12 / 4 && bVar2.read(bArr7) == 4; j13++) {
                                                            if (j13 != 1) {
                                                                if (Arrays.equals(bArr7, f4591s)) {
                                                                    z4 = true;
                                                                } else if (Arrays.equals(bArr7, f4592t)) {
                                                                    z10 = true;
                                                                }
                                                                if (z4 && z10) {
                                                                    bVar2.close();
                                                                    return 12;
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        if (f4584l) {
                                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                        }
                                                        if (bVar2 != null) {
                                                        }
                                                        bVar4 = new b(bArr4);
                                                        ByteOrder byteOrderQ3 = q(bVar4);
                                                        this.f4603f = byteOrderQ3;
                                                        bVar4.f4571b = byteOrderQ3;
                                                        s10 = bVar4.readShort();
                                                        if (s10 != 20306) {
                                                            i10 = 1;
                                                        } else {
                                                            i10 = 1;
                                                        }
                                                        bVar4.close();
                                                        if (i10 != 0) {
                                                            return 7;
                                                        }
                                                        bVar7 = new b(bArr4);
                                                        ByteOrder byteOrderQ4 = q(bVar7);
                                                        this.f4603f = byteOrderQ4;
                                                        bVar7.f4571b = byteOrderQ4;
                                                        if (bVar7.readShort() == 85) {
                                                            i11 = 1;
                                                        } else {
                                                            i11 = i;
                                                        }
                                                        bVar7.close();
                                                        if (i11 != 0) {
                                                            return 10;
                                                        }
                                                        i12 = i;
                                                        while (true) {
                                                            bArr = f4595w;
                                                            if (i12 < bArr.length) {
                                                                i13 = 1;
                                                                break;
                                                            }
                                                            if (bArr4[i12] != bArr[i12]) {
                                                                i13 = i;
                                                                break;
                                                            }
                                                            i12++;
                                                        }
                                                        if (i13 != 0) {
                                                            return 13;
                                                        }
                                                        i14 = i;
                                                        while (true) {
                                                            bArr2 = A;
                                                            if (i14 < bArr2.length) {
                                                                i15 = i;
                                                                while (true) {
                                                                    bArr3 = B;
                                                                    if (i15 >= bArr3.length) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    if (bArr4[bArr2.length + i15 + 4] != bArr3[i15]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i15++;
                                                                }
                                                                if (i18 != 0) {
                                                                    return 14;
                                                                }
                                                                return i;
                                                            }
                                                            if (bArr4[i14] != bArr2[i14]) {
                                                                break;
                                                                break;
                                                            }
                                                            i14++;
                                                        }
                                                        i18 = i;
                                                        if (i18 != 0) {
                                                            return 14;
                                                        }
                                                        return i;
                                                    }
                                                }
                                                bVar2.close();
                                                bVar4 = new b(bArr4);
                                                ByteOrder byteOrderQ5 = q(bVar4);
                                                this.f4603f = byteOrderQ5;
                                                bVar4.f4571b = byteOrderQ5;
                                                s10 = bVar4.readShort();
                                                if (s10 != 20306) {
                                                    i10 = 1;
                                                } else {
                                                    i10 = 1;
                                                }
                                                bVar4.close();
                                                if (i10 != 0) {
                                                    return 7;
                                                }
                                                bVar7 = new b(bArr4);
                                                ByteOrder byteOrderQ6 = q(bVar7);
                                                this.f4603f = byteOrderQ6;
                                                bVar7.f4571b = byteOrderQ6;
                                                if (bVar7.readShort() == 85) {
                                                    i11 = 1;
                                                } else {
                                                    i11 = i;
                                                }
                                                bVar7.close();
                                                if (i11 != 0) {
                                                    return 10;
                                                }
                                                i12 = i;
                                                while (true) {
                                                    bArr = f4595w;
                                                    if (i12 < bArr.length) {
                                                        i13 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i12] != bArr[i12]) {
                                                        i13 = i;
                                                        break;
                                                    }
                                                    i12++;
                                                }
                                                if (i13 != 0) {
                                                    return 13;
                                                }
                                                i14 = i;
                                                while (true) {
                                                    bArr2 = A;
                                                    if (i14 < bArr2.length) {
                                                        i15 = i;
                                                        while (true) {
                                                            bArr3 = B;
                                                            if (i15 >= bArr3.length) {
                                                                break;
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i15 + 4] != bArr3[i15]) {
                                                                break;
                                                                break;
                                                            }
                                                            i15++;
                                                        }
                                                        if (i18 != 0) {
                                                            return 14;
                                                        }
                                                        return i;
                                                    }
                                                    if (bArr4[i14] != bArr2[i14]) {
                                                        break;
                                                        break;
                                                    }
                                                    i14++;
                                                }
                                                i18 = i;
                                                if (i18 != 0) {
                                                    return 14;
                                                }
                                                return i;
                                            }
                                            ByteOrder byteOrderQ7 = q(bVar4);
                                            this.f4603f = byteOrderQ7;
                                            bVar4.f4571b = byteOrderQ7;
                                            s10 = bVar4.readShort();
                                            if (s10 != 20306) {
                                                i10 = 1;
                                            } else {
                                                i10 = 1;
                                            }
                                            bVar4.close();
                                        } catch (Exception unused3) {
                                            if (bVar4 != null) {
                                                bVar4.close();
                                            }
                                            i10 = i;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bVar3 = bVar4;
                                            if (bVar3 != null) {
                                                bVar3.close();
                                            }
                                            throw th;
                                        }
                                        bVar4 = new b(bArr4);
                                    } catch (Exception unused4) {
                                        bVar4 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bVar3 = null;
                                    }
                                    bVar2.close();
                                    i = 0;
                                } catch (Exception e4) {
                                    e = e4;
                                    i = 0;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            i = 0;
                            bVar2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            bVar = null;
                        }
                        if (i10 != 0) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderQ8 = q(bVar7);
                        this.f4603f = byteOrderQ8;
                        bVar7.f4571b = byteOrderQ8;
                        if (bVar7.readShort() == 85) {
                            i11 = 1;
                        } else {
                            i11 = i;
                        }
                        bVar7.close();
                        if (i11 != 0) {
                            return 10;
                        }
                        i12 = i;
                        while (true) {
                            bArr = f4595w;
                            if (i12 < bArr.length) {
                                i13 = 1;
                                break;
                            }
                            if (bArr4[i12] != bArr[i12]) {
                                i13 = i;
                                break;
                            }
                            i12++;
                        }
                        if (i13 != 0) {
                            return 13;
                        }
                        i14 = i;
                        while (true) {
                            bArr2 = A;
                            if (i14 < bArr2.length) {
                                i15 = i;
                                while (true) {
                                    bArr3 = B;
                                    if (i15 >= bArr3.length) {
                                        break;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i15 + 4] != bArr3[i15]) {
                                        break;
                                        break;
                                    }
                                    i15++;
                                }
                                if (i18 != 0) {
                                    return 14;
                                }
                                return i;
                            }
                            if (bArr4[i14] != bArr2[i14]) {
                                break;
                                break;
                            }
                            i14++;
                        }
                        i18 = i;
                        if (i18 != 0) {
                            return 14;
                        }
                        return i;
                    }
                }
                return 9;
            }
            i16++;
        }
    }

    public final void g(f fVar) throws Throwable {
        int i;
        int i10;
        j(fVar);
        HashMap[] mapArr = this.f4602d;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f4577d);
            fVar2.f4571b = this.f4603f;
            byte[] bArr = f4593u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.d(0L);
            byte[] bArr3 = f4594v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.d(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f4603f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i11 = iArr[2];
                int i12 = iArr[0];
                if (i11 <= i12 || (i = iArr[3]) <= (i10 = iArr[1])) {
                    return;
                }
                int i13 = (i11 - i12) + 1;
                int i14 = (i - i10) + 1;
                if (i13 < i14) {
                    int i15 = i13 + i14;
                    i14 = i15 - i14;
                    i13 = i15 - i14;
                }
                c cVarC = c.c(i13, this.f4603f);
                c cVarC2 = c.c(i14, this.f4603f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void h(b bVar) throws Throwable {
        if (f4584l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f4571b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f4595w;
        bVar.c(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i10 = length + 8;
                if (i10 == 16 && !Arrays.equals(bArr2, f4597y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f4598z)) {
                    return;
                }
                if (Arrays.equals(bArr2, f4596x)) {
                    byte[] bArr3 = new byte[i];
                    if (bVar.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + n9.b.d(bArr2));
                    }
                    int i11 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i11) {
                        this.h = i10;
                        r(0, bArr3);
                        x();
                        u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i11 + ", calculated CRC value: " + crc32.getValue());
                }
                int i12 = i + 4;
                bVar.c(i12);
                length = i10 + i12;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) throws Throwable {
        boolean z4 = f4584l;
        if (z4) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.c(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.c(i - bVar.f4572c);
        bVar.read(bArr4);
        e(new b(bArr4), i, 5);
        bVar.c(i11 - bVar.f4572c);
        bVar.f4571b = ByteOrder.BIG_ENDIAN;
        int i12 = bVar.readInt();
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i12);
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == G.f4578a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarC = c.c(s10, this.f4603f);
                c cVarC2 = c.c(s11, this.f4603f);
                HashMap[] mapArr = this.f4602d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                if (z4) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.c(unsignedShort2);
        }
    }

    public final void j(f fVar) throws Throwable {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f4601c == 8) {
            HashMap[] mapArr = this.f4602d;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f4577d);
                fVar2.f4571b = this.f4603f;
                fVar2.c(6);
                s(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) throws Throwable {
        if (f4584l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] mapArr = this.f4602d;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f4577d), (int) cVar.f4576c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) throws Throwable {
        if (f4584l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f4571b = ByteOrder.LITTLE_ENDIAN;
        bVar.c(A.length);
        int i = bVar.readInt() + 8;
        byte[] bArr = B;
        bVar.c(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i10 = bVar.readInt();
                int i11 = length + 8;
                if (Arrays.equals(C, bArr2)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) == i10) {
                        this.h = i11;
                        r(0, bArr3);
                        u(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + n9.b.d(bArr2));
                    }
                }
                if (i10 % 2 == 1) {
                    i10++;
                }
                length = i11 + i10;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.c(i10);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f4603f);
        int iE2 = cVar2.e(this.f4603f);
        if (this.f4601c == 7) {
            iE += this.i;
        }
        if (iE > 0 && iE2 > 0 && this.f4600b == null && this.f4599a == null) {
            bVar.skip(iE);
            bVar.read(new byte[iE2]);
        }
        if (f4584l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f4603f) <= 512 && cVar2.e(this.f4603f) <= 512;
    }

    public final void o(f fVar) throws IOException {
        ByteOrder byteOrderQ = q(fVar);
        this.f4603f = byteOrderQ;
        fVar.f4571b = byteOrderQ;
        int unsignedShort = fVar.readUnsignedShort();
        int i = this.f4601c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i10 = fVar.readInt();
        if (i10 < 8) {
            throw new IOException(v.f(i10, "Invalid first Ifd offset: "));
        }
        int i11 = i10 - 8;
        if (i11 > 0) {
            fVar.c(i11);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f4602d;
            if (i >= mapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + mapArr[i].size());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f4603f) + "'");
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
    /* JADX WARN: Code duplicated, block: B:108:0x0220  */
    /* JADX WARN: Code duplicated, block: B:109:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0231  */
    /* JADX WARN: Code duplicated, block: B:112:0x0238  */
    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    /* JADX WARN: Code duplicated, block: B:117:0x025a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0269  */
    /* JADX WARN: Code duplicated, block: B:121:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x028a  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02df  */
    /* JADX WARN: Code duplicated, block: B:140:0x0309  */
    /* JADX WARN: Code duplicated, block: B:167:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Code duplicated, block: B:97:0x0208  */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:120:0x0269, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x028a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0160, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01e8, please report this as an issue */
    public final void s(f fVar, int i) throws IOException {
        HashMap[] mapArr;
        long j4;
        long j10;
        boolean z4;
        int i10;
        long j11;
        Integer num;
        long j12;
        String str;
        int i11;
        int unsignedShort;
        long j13;
        int i12;
        Integer numValueOf = Integer.valueOf(fVar.f4572c);
        HashSet hashSet = this.e;
        hashSet.add(numValueOf);
        short s10 = fVar.readShort();
        boolean z10 = f4584l;
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s10));
        }
        if (s10 <= 0) {
            return;
        }
        short s11 = 0;
        while (true) {
            mapArr = this.f4602d;
            if (s11 >= s10) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i13 = fVar.readInt();
            long j14 = ((long) fVar.f4572c) + 4;
            d dVar = (d) J[i].get(Integer.valueOf(unsignedShort2));
            if (z10) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), dVar != null ? dVar.f4579b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i13)));
            }
            if (dVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = E;
                    if (unsignedShort3 < iArr.length) {
                        int i14 = dVar.f4580c;
                        if (i14 == 7 || unsignedShort3 == 7 || i14 == unsignedShort3 || (i10 = dVar.f4581d) == unsignedShort3 || (((i14 == 4 || i10 == 4) && unsignedShort3 == 3) || (((i14 == 9 || i10 == 9) && unsignedShort3 == 8) || ((i14 == 12 || i10 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i14;
                            }
                            j4 = j14;
                            j10 = ((long) i13) * ((long) iArr[unsignedShort3]);
                            if (j10 < 0 || j10 > 2147483647L) {
                                if (z10 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i13);
                                }
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                        } else if (z10 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + D[unsignedShort3] + ") is unexpected for tag: " + dVar.f4579b);
                        }
                    }
                    if (z4) {
                        j11 = j4;
                        if (j10 > 4) {
                            i12 = fVar.readInt();
                            if (z10 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i12);
                            }
                            if (this.f4601c == 7) {
                                if ("MakerNote".equals(dVar.f4579b)) {
                                    this.i = i12;
                                } else if (i != 6 && "ThumbnailImage".equals(dVar.f4579b)) {
                                    this.f4605j = i12;
                                    this.f4606k = i13;
                                    c cVarC = c.c(6, this.f4603f);
                                    c cVarA = c.a(this.f4605j, this.f4603f);
                                    c cVarA2 = c.a(this.f4606k, this.f4603f);
                                    mapArr[4].put("Compression", cVarC);
                                    mapArr[4].put("JPEGInterchangeFormat", cVarA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", cVarA2);
                                }
                            }
                            fVar.d(i12);
                        } else {
                            j11 = j11;
                            unsignedShort2 = unsignedShort2;
                            unsignedShort3 = unsignedShort3;
                        }
                        num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                        if (z10 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                        }
                        if (num != null) {
                            i11 = unsignedShort3;
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    j13 = ((long) fVar.readInt()) & 4294967295L;
                                } else if (i11 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (i11 != 9 || i11 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    j13 = -1;
                                }
                                if (z10 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f4579b));
                                }
                                if (j13 > 0) {
                                    if (!hashSet.contains(Integer.valueOf((int) j13))) {
                                        fVar.d(j13);
                                        s(fVar, num.intValue());
                                    } else if (z10 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j13 + ")");
                                    }
                                } else if (z10 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j13);
                                }
                                fVar.d(j11);
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            j13 = unsignedShort;
                            if (z10 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f4579b));
                            }
                            if (j13 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j13))) {
                                    fVar.d(j13);
                                    s(fVar, num.intValue());
                                } else if (z10 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j13 + ")");
                                }
                            } else if (z10 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j13);
                            }
                            fVar.d(j11);
                        } else {
                            j12 = j11;
                            int i15 = fVar.f4572c + this.h;
                            byte[] bArr = new byte[(int) j10];
                            fVar.readFully(bArr);
                            c cVar = new c(i15, bArr, unsignedShort3, i13);
                            HashMap map = mapArr[i];
                            str = dVar.f4579b;
                            map.put(str, cVar);
                            if ("DNGVersion".equals(str)) {
                                this.f4601c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && cVar.f(this.f4603f).contains("PENTAX")) || ("Compression".equals(str) && cVar.e(this.f4603f) == 65535)) {
                                this.f4601c = 8;
                            }
                            if (fVar.f4572c != j12) {
                                fVar.d(j12);
                            }
                        }
                    } else {
                        fVar.d(j4);
                    }
                    s11 = (short) (s11 + 1);
                    s10 = s10;
                    z10 = z10;
                }
                j4 = j14;
                if (z10 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j10 = 0;
                z4 = false;
                if (z4) {
                    fVar.d(j4);
                } else {
                    j11 = j4;
                    if (j10 > 4) {
                        i12 = fVar.readInt();
                        if (z10 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i12);
                        }
                        if (this.f4601c == 7) {
                            if ("MakerNote".equals(dVar.f4579b)) {
                                this.i = i12;
                            } else if (i != 6) {
                            }
                        }
                        fVar.d(i12);
                    } else {
                        j11 = j11;
                        unsignedShort2 = unsignedShort2;
                        unsignedShort3 = unsignedShort3;
                    }
                    num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                    if (z10 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        i11 = unsignedShort3;
                        if (i11 != 3) {
                            if (i11 == 4) {
                                j13 = ((long) fVar.readInt()) & 4294967295L;
                            } else if (i11 == 8) {
                                if (i11 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z10 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f4579b));
                            }
                            if (j13 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j13))) {
                                    fVar.d(j13);
                                    s(fVar, num.intValue());
                                } else if (z10 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j13 + ")");
                                }
                            } else if (z10 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j13);
                            }
                            fVar.d(j11);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        j13 = unsignedShort;
                        if (z10 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f4579b));
                        }
                        if (j13 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j13))) {
                                fVar.d(j13);
                                s(fVar, num.intValue());
                            } else if (z10 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j13 + ")");
                            }
                        } else if (z10 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j13);
                        }
                        fVar.d(j11);
                    } else {
                        j12 = j11;
                        int i16 = fVar.f4572c + this.h;
                        byte[] bArr2 = new byte[(int) j10];
                        fVar.readFully(bArr2);
                        c cVar2 = new c(i16, bArr2, unsignedShort3, i13);
                        HashMap map2 = mapArr[i];
                        str = dVar.f4579b;
                        map2.put(str, cVar2);
                        if ("DNGVersion".equals(str)) {
                            this.f4601c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f4601c = 8;
                        if (fVar.f4572c != j12) {
                            fVar.d(j12);
                        }
                    }
                }
                s11 = (short) (s11 + 1);
                s10 = s10;
                z10 = z10;
            } else if (z10) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j4 = j14;
            j10 = 0;
            z4 = false;
            if (z4) {
                fVar.d(j4);
            } else {
                j11 = j4;
                if (j10 > 4) {
                    i12 = fVar.readInt();
                    if (z10 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i12);
                    }
                    if (this.f4601c == 7) {
                        if ("MakerNote".equals(dVar.f4579b)) {
                            this.i = i12;
                        } else if (i != 6) {
                        }
                    }
                    fVar.d(i12);
                } else {
                    j11 = j11;
                    unsignedShort2 = unsignedShort2;
                    unsignedShort3 = unsignedShort3;
                }
                num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                if (z10 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                }
                if (num != null) {
                    i11 = unsignedShort3;
                    if (i11 != 3) {
                        if (i11 == 4) {
                            j13 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (i11 == 8) {
                            if (i11 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z10 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f4579b));
                        }
                        if (j13 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j13))) {
                                fVar.d(j13);
                                s(fVar, num.intValue());
                            } else if (z10 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j13 + ")");
                            }
                        } else if (z10 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j13);
                        }
                        fVar.d(j11);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j13 = unsignedShort;
                    if (z10 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f4579b));
                    }
                    if (j13 > 0) {
                        if (!hashSet.contains(Integer.valueOf((int) j13))) {
                            fVar.d(j13);
                            s(fVar, num.intValue());
                        } else if (z10 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j13 + ")");
                        }
                    } else if (z10 != 0) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j13);
                    }
                    fVar.d(j11);
                } else {
                    j12 = j11;
                    int i17 = fVar.f4572c + this.h;
                    byte[] bArr3 = new byte[(int) j10];
                    fVar.readFully(bArr3);
                    c cVar3 = new c(i17, bArr3, unsignedShort3, i13);
                    HashMap map3 = mapArr[i];
                    str = dVar.f4579b;
                    map3.put(str, cVar3);
                    if ("DNGVersion".equals(str)) {
                        this.f4601c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f4601c = 8;
                    if (fVar.f4572c != j12) {
                        fVar.d(j12);
                    }
                }
            }
            s11 = (short) (s11 + 1);
            s10 = s10;
            z10 = z10;
        }
        boolean z11 = z10;
        int i18 = fVar.readInt();
        if (z11) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i18)));
        }
        long j15 = i18;
        if (j15 <= 0) {
            if (z11) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i18);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(i18))) {
            if (z11) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i18);
                return;
            }
            return;
        }
        fVar.d(j15);
        if (mapArr[4].isEmpty()) {
            s(fVar, 4);
        } else if (mapArr[5].isEmpty()) {
            s(fVar, 5);
        }
    }

    public final void t(int i, String str, String str2) {
        HashMap[] mapArr = this.f4602d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void u(b bVar) throws Throwable {
        c cVar;
        int iE;
        HashMap map = this.f4602d[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            m(bVar, map);
            return;
        }
        int iE2 = cVar2.e(this.f4603f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(bVar, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f4603f);
            int[] iArr2 = f4587o;
            if (Arrays.equals(iArr2, iArr) || (this.f4601c == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iE = cVar.e(this.f4603f)) == 1 && Arrays.equals(iArr, f4588p)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrG = n9.b.g(cVar4.g(this.f4603f));
                long[] jArrG2 = n9.b.g(cVar5.g(this.f4603f));
                if (jArrG == null || jArrG.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrG2 == null || jArrG2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrG.length != jArrG2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j4 = 0;
                for (long j10 : jArrG2) {
                    j4 += j10;
                }
                byte[] bArr = new byte[(int) j4];
                this.f4604g = true;
                int i = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < jArrG.length; i11++) {
                    int i12 = (int) jArrG[i11];
                    int i13 = (int) jArrG2[i11];
                    if (i11 < jArrG.length - 1 && i12 + i13 != jArrG[i11 + 1]) {
                        this.f4604g = false;
                    }
                    int i14 = i12 - i;
                    if (i14 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j11 = i14;
                    if (bVar.skip(j11) != j11) {
                        Log.d("ExifInterface", "Failed to skip " + i14 + " bytes.");
                        return;
                    }
                    int i15 = i + i14;
                    byte[] bArr2 = new byte[i13];
                    if (bVar.read(bArr2) != i13) {
                        Log.d("ExifInterface", "Failed to read " + i13 + " bytes.");
                        return;
                    }
                    i = i15 + i13;
                    System.arraycopy(bArr2, 0, bArr, i10, i13);
                    i10 += i13;
                }
                if (this.f4604g) {
                    long j12 = jArrG[0];
                    return;
                }
                return;
            }
        }
        if (f4584l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i10) throws Throwable {
        HashMap[] mapArr = this.f4602d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z4 = f4584l;
        if (zIsEmpty || mapArr[i10].isEmpty()) {
            if (z4) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i].get("ImageLength");
        c cVar2 = (c) mapArr[i].get("ImageWidth");
        c cVar3 = (c) mapArr[i10].get("ImageLength");
        c cVar4 = (c) mapArr[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z4) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z4) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = cVar.e(this.f4603f);
        int iE2 = cVar2.e(this.f4603f);
        int iE3 = cVar3.e(this.f4603f);
        int iE4 = cVar4.e(this.f4603f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i10];
        mapArr[i10] = map;
    }

    public final void w(f fVar, int i) throws Throwable {
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.f4602d;
        c cVar = (c) mapArr[i].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f4574a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f4603f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f4603f);
                cVarC2 = c.b(eVarArr[1], this.f4603f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f4603f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarC = c.c(iArr[0], this.f4603f);
                cVarC2 = c.c(iArr[1], this.f4603f);
            }
            mapArr[i].put("ImageWidth", cVarC);
            mapArr[i].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f4603f);
            int iE2 = cVar4.e(this.f4603f);
            int iE3 = cVar5.e(this.f4603f);
            int iE4 = cVar3.e(this.f4603f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f4603f);
            c cVarC4 = c.c(iE3 - iE4, this.f4603f);
            mapArr[i].put("ImageLength", cVarC3);
            mapArr[i].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i].get("ImageLength");
        c cVar7 = (c) mapArr[i].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f4603f);
            int iE6 = cVar8.e(this.f4603f);
            fVar.d(iE5);
            byte[] bArr = new byte[iE6];
            fVar.read(bArr);
            e(new b(bArr), iE5, i);
        }
    }

    public final void x() throws Throwable {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.f4602d;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
