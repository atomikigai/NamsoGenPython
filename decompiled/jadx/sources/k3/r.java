package k3;

import android.util.Base64;
import android.util.Log;
import da.v;
import h6.o0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5972d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExecutorService f5973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ServerSocket f5974g;
    public final Object h;
    public int i;

    public r(int i, int i10, String str, String str2, String str3) {
        jc.i.e(str, "upHost");
        jc.i.e(str2, "upUser");
        jc.i.e(str3, "upPass");
        this.f5969a = i;
        this.f5970b = str;
        this.f5971c = i10;
        this.f5972d = str2;
        this.e = str3;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new p(1));
        jc.i.d(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
        this.f5973f = executorServiceNewCachedThreadPool;
        this.h = new Object();
    }

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                v.s(autoCloseable);
            } catch (Throwable unused) {
            }
        }
    }

    public static String i(String str, String str2, ArrayList arrayList) {
        String strSubstring;
        boolean z4 = false;
        List listV0 = pc.g.v0(str, new char[]{' '}, 6);
        String str3 = (String) vb.i.b0(0, listV0);
        if (str3 == null) {
            str3 = "GET";
        }
        String str4 = (String) vb.i.b0(2, listV0);
        if (str4 == null) {
            str4 = "HTTP/1.1";
        }
        String strSubstring2 = (String) vb.i.b0(1, pc.g.v0(str, new char[]{' '}, 6));
        if (strSubstring2 == null) {
            strSubstring = null;
        } else {
            int iK0 = pc.g.k0(strSubstring2, "://", 0, false, 6);
            if (iK0 >= 0) {
                strSubstring2 = strSubstring2.substring(iK0 + 3);
                jc.i.d(strSubstring2, "substring(...)");
            }
            int iJ0 = pc.g.j0(strSubstring2, '/', 0, 6);
            if (iJ0 < 0) {
                strSubstring = "/";
            } else {
                strSubstring = strSubstring2.substring(iJ0);
                jc.i.d(strSubstring, "substring(...)");
            }
        }
        String str5 = strSubstring != null ? strSubstring : "/";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(' ');
        sb2.append(str5);
        sb2.append(' ');
        sb2.append(str4);
        sb2.append("\r\n");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str6 = (String) obj;
            if (pc.o.e0(str6, "Host:", true)) {
                sb2.append("Host: ");
                sb2.append(str2);
                sb2.append("\r\n");
                z4 = true;
            } else {
                sb2.append(str6);
                sb2.append("\r\n");
            }
        }
        if (!z4) {
            sb2.append("Host: ");
            sb2.append(str2);
            sb2.append("\r\n");
        }
        sb2.append("\r\n");
        String string = sb2.toString();
        jc.i.d(string, "toString(...)");
        return string;
    }

    public static String k(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder(80);
        boolean z4 = false;
        do {
            int i = inputStream.read();
            if (i == -1) {
                if (sb2.length() == 0) {
                    return null;
                }
                return sb2.toString();
            }
            if (i == 10) {
                return sb2.toString();
            }
            if (z4) {
                sb2.append('\r');
            }
            z4 = i == 13;
            if (!z4) {
                sb2.append((char) i);
            }
        } while (sb2.length() <= 8192);
        return sb2.toString();
    }

    public final String a() {
        int i = this.f5969a;
        if (i == 2 || i == 3) {
            return "";
        }
        String str = this.f5972d;
        if (str.length() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("Proxy-Authorization: Basic ");
        byte[] bytes = (str + ':' + this.e).getBytes(pc.a.f7847b);
        jc.i.d(bytes, "getBytes(...)");
        sb2.append(Base64.encodeToString(bytes, 2));
        return sb2.toString();
    }

    public final Socket c(String str) {
        try {
            int i = this.f5969a;
            if (i != 2 && i != 3) {
                return g(str);
            }
            return m(str);
        } catch (Throwable th) {
            StringBuilder sbN = q1.a.n("dial ", str, " falló: ");
            sbN.append(th.getMessage());
            Log.w("krypt-relay", sbN.toString());
            return null;
        }
    }

    public final void d(Socket socket) {
        try {
            socket.setTcpNoDelay(true);
            InputStream inputStream = socket.getInputStream();
            jc.i.b(inputStream);
            String strK = k(inputStream);
            if (strK != null && strK.length() != 0) {
                Log.d("krypt-relay", "→ ".concat(pc.g.A0(80, strK)));
                Socket socketE = pc.o.e0(strK, "CONNECT", true) ? e(strK, inputStream, socket) : f(strK, inputStream, socket);
                b(socket);
                b(socketE);
                return;
            }
            Log.d("krypt-relay", "cliente sin petición (conexión vacía)");
            b(socket);
        } catch (Throwable th) {
            try {
                Log.w("krypt-relay", "error atendiendo cliente: " + th);
            } finally {
                b(socket);
            }
        }
    }

    public final Socket e(String str, InputStream inputStream, Socket socket) throws IOException {
        String strK;
        String str2 = (String) vb.i.b0(1, pc.g.v0(str, new char[]{' '}, 6));
        String string = str2 != null ? pc.g.B0(str2).toString() : null;
        if (string == null) {
            string = "";
        }
        if (!pc.g.m0(string)) {
            do {
                strK = k(inputStream);
                if (strK == null) {
                    break;
                }
            } while (strK.length() != 0);
            Socket socketC = c(string);
            if (socketC != null) {
                try {
                    OutputStream outputStream = socket.getOutputStream();
                    jc.i.d(outputStream, "getOutputStream(...)");
                    try {
                        byte[] bytes = "HTTP/1.1 200 Connection established\r\n\r\n".getBytes(pc.a.f7847b);
                        jc.i.d(bytes, "getBytes(...)");
                        outputStream.write(bytes);
                        outputStream.flush();
                    } catch (Throwable unused) {
                    }
                    OutputStream outputStream2 = socket.getOutputStream();
                    jc.i.d(outputStream2, "getOutputStream(...)");
                    InputStream inputStream2 = socketC.getInputStream();
                    jc.i.d(inputStream2, "getInputStream(...)");
                    OutputStream outputStream3 = socketC.getOutputStream();
                    jc.i.d(outputStream3, "getOutputStream(...)");
                    j(inputStream, outputStream2, inputStream2, outputStream3);
                    return socketC;
                } catch (Throwable th) {
                    StringBuilder sbN = q1.a.n("túnel ", string, " interrumpido: ");
                    sbN.append(th.getMessage());
                    Log.d("krypt-relay", sbN.toString());
                    return socketC;
                }
            }
            Log.w("krypt-relay", "CONNECT " + string + " → 502 (túnel falló)");
            OutputStream outputStream4 = socket.getOutputStream();
            jc.i.d(outputStream4, "getOutputStream(...)");
            try {
                byte[] bytes2 = "HTTP/1.1 502 Bad Gateway\r\nConnection: close\r\n\r\n".getBytes(pc.a.f7847b);
                jc.i.d(bytes2, "getBytes(...)");
                outputStream4.write(bytes2);
                outputStream4.flush();
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.net.Socket] */
    public final Socket f(String str, InputStream inputStream, Socket socket) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strK = k(inputStream);
            if (strK == null || strK.length() == 0) {
                break;
            }
            arrayList.add(strK);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str2 = (String) obj;
            if (!pc.o.e0(str2, "Proxy-Authorization:", true) && !pc.o.e0(str2, "Proxy-Connection:", true) && !pc.o.e0(str2, "Connection:", true) && !pc.o.e0(str2, "Keep-Alive:", true)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayListG0 = vb.i.g0(vb.i.g0(arrayList2, "Connection: close"), a());
        ?? H = 3;
        int i11 = this.f5969a;
        try {
            if (i11 == 2 || i11 == 3) {
                String strConcat = (String) vb.i.b0(1, pc.g.v0(str, new char[]{' '}, 6));
                if (strConcat == null) {
                    strConcat = null;
                } else {
                    int iK0 = pc.g.k0(strConcat, "://", 0, false, 6);
                    if (iK0 >= 0) {
                        strConcat = strConcat.substring(iK0 + 3);
                        jc.i.d(strConcat, "substring(...)");
                    }
                    int iJ0 = pc.g.j0(strConcat, '/', 0, 6);
                    if (iJ0 >= 0) {
                        strConcat = strConcat.substring(0, iJ0);
                        jc.i.d(strConcat, "substring(...)");
                    }
                    if (!pc.g.g0(strConcat, ':')) {
                        strConcat = strConcat.concat(":80");
                    }
                }
                if (strConcat == null) {
                    return null;
                }
                H = h(strConcat);
                OutputStream outputStream = socket.getOutputStream();
                byte[] bytes = i(str, strConcat, arrayListG0).getBytes(pc.a.f7847b);
                jc.i.d(bytes, "getBytes(...)");
                outputStream.write(bytes);
                outputStream.flush();
                InputStream inputStream2 = H.getInputStream();
                jc.i.d(inputStream2, "getInputStream(...)");
                OutputStream outputStream2 = H.getOutputStream();
                jc.i.d(outputStream2, "getOutputStream(...)");
                j(inputStream, outputStream, inputStream2, outputStream2);
            } else {
                H = new Socket();
                H.connect(new InetSocketAddress(this.f5970b, this.f5971c), 10000);
                H.setTcpNoDelay(true);
                OutputStream outputStream3 = socket.getOutputStream();
                OutputStream outputStream4 = H.getOutputStream();
                byte[] bytes2 = (str + "\r\n").getBytes(pc.a.f7847b);
                jc.i.d(bytes2, "getBytes(...)");
                outputStream4.write(bytes2);
                int size2 = arrayListG0.size();
                while (i < size2) {
                    Object obj2 = arrayListG0.get(i);
                    i++;
                    byte[] bytes3 = (((String) obj2) + "\r\n").getBytes(pc.a.f7847b);
                    jc.i.d(bytes3, "getBytes(...)");
                    outputStream4.write(bytes3);
                }
                byte[] bytes4 = "\r\n".getBytes(pc.a.f7847b);
                jc.i.d(bytes4, "getBytes(...)");
                outputStream4.write(bytes4);
                outputStream4.flush();
                jc.i.b(outputStream3);
                InputStream inputStream3 = H.getInputStream();
                jc.i.d(inputStream3, "getInputStream(...)");
                OutputStream outputStream5 = H.getOutputStream();
                jc.i.d(outputStream5, "getOutputStream(...)");
                j(inputStream, outputStream3, inputStream3, outputStream5);
            }
        } catch (Throwable unused) {
        }
        return H;
    }

    public final Socket g(String str) {
        String strK;
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(this.f5970b, this.f5971c), 10000);
            socket.setSoTimeout(10000);
            socket.setTcpNoDelay(true);
            StringBuilder sb2 = new StringBuilder("CONNECT ");
            sb2.append(str);
            sb2.append(" HTTP/1.1\r\nHost: ");
            sb2.append(str);
            sb2.append("\r\n");
            String strA = a();
            if (strA.length() <= 0) {
                strA = null;
            }
            if (strA != null) {
                sb2.append(strA);
                sb2.append("\r\n");
            }
            sb2.append("\r\n");
            String string = sb2.toString();
            OutputStream outputStream = socket.getOutputStream();
            byte[] bytes = string.getBytes(pc.a.f7847b);
            jc.i.d(bytes, "getBytes(...)");
            outputStream.write(bytes);
            outputStream.flush();
            InputStream inputStream = socket.getInputStream();
            jc.i.d(inputStream, "getInputStream(...)");
            String strK2 = k(inputStream);
            if (strK2 == null) {
                throw new IllegalStateException("sin respuesta");
            }
            do {
                InputStream inputStream2 = socket.getInputStream();
                jc.i.d(inputStream2, "getInputStream(...)");
                strK = k(inputStream2);
                if (strK == null) {
                    break;
                }
            } while (strK.length() != 0);
            socket.setSoTimeout(0);
            if (pc.g.f0(strK2, " 200", false)) {
                return socket;
            }
            b(socket);
            throw new IllegalStateException(pc.g.A0(48, strK2));
        } catch (Throwable th) {
            b(socket);
            throw th;
        }
    }

    public final Socket h(String str) {
        int iN0 = pc.g.n0(str, ':', 0, 6);
        if (iN0 <= 0) {
            throw new IllegalArgumentException("host:port invalido");
        }
        String strSubstring = str.substring(0, iN0);
        jc.i.d(strSubstring, "substring(...)");
        String strS0 = pc.g.s0(pc.g.r0(strSubstring, "["), "]");
        String strSubstring2 = str.substring(iN0 + 1);
        jc.i.d(strSubstring2, "substring(...)");
        int i = Integer.parseInt(strSubstring2);
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(this.f5970b, this.f5971c), 10000);
            socket.setSoTimeout(10000);
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();
            outputStream.write(new byte[]{5, 2, 0, 2});
            outputStream.flush();
            if (inputStream.read() != 5) {
                throw new IllegalStateException("socks no v5");
            }
            int i10 = inputStream.read();
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("metodo rechazado");
                }
                l(outputStream, inputStream);
            }
            byte[] bytes = strS0.getBytes(pc.a.f7847b);
            jc.i.d(bytes, "getBytes(...)");
            int length = bytes.length;
            byte[] bArr = new byte[length + 7];
            bArr[0] = 5;
            bArr[1] = 1;
            bArr[2] = 0;
            bArr[3] = 3;
            bArr[4] = (byte) bytes.length;
            System.arraycopy(bytes, 0, bArr, 5, bytes.length);
            bArr[length + 5] = (byte) ((i >> 8) & 255);
            bArr[length + 6] = (byte) (i & 255);
            outputStream.write(bArr);
            outputStream.flush();
            int i11 = inputStream.read();
            int i12 = inputStream.read();
            if (i11 != 5 || i12 != 0) {
                throw new IllegalStateException("socks rep=" + i12);
            }
            int i13 = inputStream.read();
            if (i13 == 1) {
                inputStream.readNBytes(4);
            } else if (i13 == 3) {
                int i14 = inputStream.read();
                if (i14 > 0) {
                    inputStream.readNBytes(i14);
                }
            } else if (i13 == 4) {
                inputStream.readNBytes(16);
            }
            inputStream.readNBytes(2);
            socket.setSoTimeout(0);
            return socket;
        } catch (Throwable th) {
            b(socket);
            throw th;
        }
    }

    public final void j(InputStream inputStream, OutputStream outputStream, InputStream inputStream2, OutputStream outputStream2) throws InterruptedException {
        Thread thread = new Thread(new q(inputStream, outputStream2, this, inputStream2, 1));
        thread.setDaemon(true);
        thread.setName("krypt-pump");
        thread.start();
        try {
            qd.b.n(inputStream2, outputStream, 32768);
            outputStream.flush();
        } catch (Throwable unused) {
        }
        try {
            outputStream.flush();
        } catch (Throwable unused2) {
        }
        b(inputStream);
        thread.join(5000L);
    }

    public final void l(OutputStream outputStream, InputStream inputStream) throws IOException {
        Charset charset = pc.a.f7847b;
        byte[] bytes = this.f5972d.getBytes(charset);
        jc.i.d(bytes, "getBytes(...)");
        List listQ = vb.h.Q(bytes);
        byte[] bytes2 = this.e.getBytes(charset);
        jc.i.d(bytes2, "getBytes(...)");
        List listQ2 = vb.h.Q(bytes2);
        byte[] bArr = new byte[listQ2.size() + listQ.size() + 3];
        int i = 0;
        bArr[0] = 1;
        bArr[1] = (byte) listQ.size();
        int i10 = 0;
        for (Object obj : listQ) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                vb.j.T();
                throw null;
            }
            bArr[i10 + 2] = ((Number) obj).byteValue();
            i10 = i11;
        }
        bArr[listQ.size() + 2] = (byte) listQ2.size();
        for (Object obj2 : listQ2) {
            int i12 = i + 1;
            if (i < 0) {
                vb.j.T();
                throw null;
            }
            bArr[listQ.size() + 3 + i] = ((Number) obj2).byteValue();
            i = i12;
        }
        outputStream.write(bArr);
        outputStream.flush();
        int i13 = inputStream.read();
        int i14 = inputStream.read();
        if (i13 != 1 || i14 != 0) {
            throw new IllegalStateException("auth socks fallida");
        }
    }

    public final Socket m(String str) {
        int iIntValue;
        if (this.f5969a != 3) {
            return h(str);
        }
        int iN0 = pc.g.n0(str, ':', 0, 6);
        if (iN0 <= 0) {
            throw new IllegalArgumentException("host:port invalido");
        }
        String strSubstring = str.substring(0, iN0);
        jc.i.d(strSubstring, "substring(...)");
        String strS0 = pc.g.s0(pc.g.r0(strSubstring, "["), "]");
        String strSubstring2 = str.substring(iN0 + 1);
        jc.i.d(strSubstring2, "substring(...)");
        int i = Integer.parseInt(strSubstring2);
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(this.f5970b, this.f5971c), 10000);
            socket.setSoTimeout(10000);
            Pattern patternCompile = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
            jc.i.d(patternCompile, "compile(...)");
            Matcher matcher = patternCompile.matcher(strS0);
            jc.i.d(matcher, "matcher(...)");
            ArrayList arrayList = null;
            o0 o0Var = !matcher.find(0) ? null : new o0(matcher, strS0);
            if (o0Var != null) {
                mc.e eVar = new mc.e(1, 4, 1);
                ArrayList arrayList2 = new ArrayList(vb.k.U(eVar));
                Iterator it = eVar.iterator();
                while (((mc.b) it).f7105d) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt((String) ((pc.e) o0Var.h()).get(((mc.b) it).nextInt()))));
                }
                if (!arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    int i10 = 0;
                    do {
                        if (i10 < size) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            iIntValue = ((Number) obj).intValue();
                            if (iIntValue < 0) {
                                break;
                            }
                        }
                    } while (iIntValue < 256);
                }
                arrayList = arrayList2;
                break;
            }
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = this.f5972d.getBytes(pc.a.f7847b);
            jc.i.d(bytes, "getBytes(...)");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(4);
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write((i >> 8) & 255);
            byteArrayOutputStream.write(i & 255);
            if (arrayList != null) {
                int size2 = arrayList.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    byteArrayOutputStream.write(((Number) obj2).intValue());
                }
            } else {
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(1);
            }
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(0);
            if (arrayList == null) {
                byte[] bytes2 = strS0.getBytes(pc.a.f7847b);
                jc.i.d(bytes2, "getBytes(...)");
                byteArrayOutputStream.write(bytes2);
                byteArrayOutputStream.write(0);
            }
            outputStream.write(byteArrayOutputStream.toByteArray());
            outputStream.flush();
            byte[] bArr = new byte[8];
            int i12 = 0;
            while (i12 < 8) {
                int i13 = inputStream.read(bArr, i12, 8 - i12);
                if (i13 < 0) {
                    throw new IllegalStateException("socks4 sin respuesta");
                }
                i12 += i13;
            }
            if (bArr[0] == 0 && (bArr[1] & 255) == 90) {
                socket.setSoTimeout(0);
                return socket;
            }
            throw new IllegalStateException("socks4 rep=" + (bArr[1] & 255));
        } catch (Throwable th) {
            b(socket);
            throw th;
        }
    }

    public final boolean n() {
        synchronized (this.h) {
            ServerSocket serverSocket = this.f5974g;
            boolean z4 = true;
            if (serverSocket != null && !serverSocket.isClosed()) {
                return true;
            }
            try {
                ServerSocket serverSocket2 = new ServerSocket();
                try {
                    serverSocket2.bind(new InetSocketAddress(InetAddress.getByName("::"), 0));
                } catch (Throwable unused) {
                    serverSocket2.bind(new InetSocketAddress(InetAddress.getByName("127.0.0.1"), 0));
                }
                this.f5974g = serverSocket2;
                this.i = serverSocket2.getLocalPort();
                StringBuilder sb2 = new StringBuilder("relay arriba en ");
                InetAddress inetAddress = serverSocket2.getInetAddress();
                sb2.append(inetAddress != null ? inetAddress.getHostAddress() : null);
                sb2.append(':');
                sb2.append(this.i);
                sb2.append(" (up=");
                sb2.append(this.f5970b);
                sb2.append(':');
                sb2.append(this.f5971c);
                sb2.append(" tipo=");
                sb2.append(this.f5969a);
                sb2.append(this.f5972d.length() == 0 ? "" : " auth");
                sb2.append("))");
                Log.i("krypt-relay", sb2.toString());
                this.f5973f.execute(new androidx.webkit.b(9, serverSocket2, this));
            } catch (Throwable th) {
                Log.w("krypt-relay", "no pudo iniciar relay: " + th);
                z4 = false;
            }
            return z4;
        }
    }

    public final void o() {
        synchronized (this.h) {
            ServerSocket serverSocket = this.f5974g;
            if (serverSocket != null && serverSocket != null && !serverSocket.isClosed()) {
                Log.i("krypt-relay", "relay detenido (puerto " + this.i + ')');
            }
            try {
                ServerSocket serverSocket2 = this.f5974g;
                if (serverSocket2 != null) {
                    serverSocket2.close();
                }
            } catch (Throwable unused) {
            }
            this.f5974g = null;
        }
    }
}
