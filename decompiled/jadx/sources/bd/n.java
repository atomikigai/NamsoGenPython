package bd;

import android.util.Log;
import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f1622d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1624g;
    public Object h;
    public Object i;

    public n(LinkedHashMap linkedHashMap, k3.r rVar, String str, k3.r rVar2) {
        this.f1619a = 1;
        this.f1622d = linkedHashMap;
        this.e = rVar;
        this.f1620b = str;
        this.f1623f = rVar2;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new k3.p(0));
        jc.i.d(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
        this.f1624g = executorServiceNewCachedThreadPool;
        this.i = new Object();
    }

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                da.v.s(autoCloseable);
            } catch (Throwable unused) {
            }
        }
    }

    public static Socket c(String str) {
        try {
            int iN0 = pc.g.n0(str, ':', 0, 6);
            if (iN0 <= 0) {
                throw new IllegalArgumentException("autoridad inválida");
            }
            String strSubstring = str.substring(0, iN0);
            jc.i.d(strSubstring, "substring(...)");
            String strS0 = pc.g.s0(pc.g.r0(strSubstring, "["), "]");
            String strSubstring2 = str.substring(iN0 + 1);
            jc.i.d(strSubstring2, "substring(...)");
            int i = Integer.parseInt(strSubstring2);
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(strS0, i), 10000);
            socket.setTcpNoDelay(true);
            return socket;
        } catch (Throwable th) {
            StringBuilder sbN = q1.a.n("directo falló (", str, "): ");
            sbN.append(th.getMessage());
            Log.d("krypt-router", sbN.toString());
            return null;
        }
    }

    public static boolean h(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        jc.i.d(lowerCase, "toLowerCase(...)");
        return lowerCase.equals("adservice.google.com") || lowerCase.equals("pagead2.googlesyndication.com") || pc.o.Z(lowerCase, ".googlesyndication.com") || lowerCase.equals("googlesyndication.com") || lowerCase.equals("googleads.g.doubleclick.net") || pc.o.Z(lowerCase, ".doubleclick.net") || lowerCase.equals("doubleclick.net") || lowerCase.equals("www.googleadservices.com") || pc.o.Z(lowerCase, ".googleadservices.com") || lowerCase.equals("googleadservices.com") || lowerCase.equals("admob.com") || pc.o.Z(lowerCase, ".admob.com") || pc.o.Z(lowerCase, ".app-measurement.com") || lowerCase.equals("app-measurement.com") || lowerCase.equals("fcmatch.google.com") || lowerCase.equals("fcmatch.youtube.com") || pc.o.Z(lowerCase, ".google-analytics.com") || lowerCase.equals("google-analytics.com");
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

    public static void m(OutputStream outputStream, String str) {
        try {
            byte[] bytes = str.getBytes(pc.a.f7847b);
            jc.i.d(bytes, "getBytes(...)");
            outputStream.write(bytes);
            outputStream.flush();
        } catch (Throwable unused) {
        }
    }

    public o a() {
        ArrayList arrayList;
        String str = this.f1620b;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = b.e(0, 0, (String) this.f1622d, 7);
        String strE2 = b.e(0, 0, (String) this.e, 7);
        String str2 = (String) this.f1623f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iD = d();
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = new ArrayList(vb.k.U(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(b.e(0, 0, (String) obj, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(vb.k.U(arrayList4));
            int size2 = arrayList4.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList4.get(i10);
                i10++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? b.e(0, 0, str3, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f1624g;
        return new o(str, strE, strE2, str2, iD, arrayList3, arrayList, str4 != null ? b.e(0, 0, str4, 7) : null, toString());
    }

    public int d() {
        int i = this.f1621c;
        if (i != -1) {
            return i;
        }
        String str = this.f1620b;
        jc.i.b(str);
        if (str.equals(ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        return str.equals(ProxyConfig.MATCH_HTTPS) ? 443 : -1;
    }

    public void e(Socket socket) {
        try {
            socket.setTcpNoDelay(true);
            InputStream inputStream = socket.getInputStream();
            jc.i.b(inputStream);
            String strK = k(inputStream);
            if (strK != null && strK.length() != 0) {
                Log.d("krypt-router", "→ ".concat(pc.g.A0(80, strK)));
                Socket socketF = pc.o.e0(strK, "CONNECT", true) ? f(strK, inputStream, socket) : g(strK, inputStream, socket);
                b(socket);
                b(socketF);
                return;
            }
            b(socket);
        } catch (Throwable th) {
            try {
                Log.w("krypt-router", "error atendiendo cliente: " + th);
            } finally {
                b(socket);
            }
        }
    }

    public Socket f(String str, InputStream inputStream, Socket socket) throws IOException {
        String strSubstring;
        Socket socketC;
        int i;
        int i10 = 1;
        String str2 = (String) vb.i.b0(1, pc.g.v0(str, new char[]{' '}, 6));
        String string = str2 != null ? pc.g.B0(str2).toString() : null;
        if (string == null) {
            string = "";
        }
        if (pc.g.m0(string)) {
            return null;
        }
        while (true) {
            String strK = k(inputStream);
            if (strK == null || strK.length() == 0) {
                break;
            }
            i10 = i10;
        }
        k3.r rVar = (k3.r) this.e;
        k3.r rVar2 = (k3.r) this.f1623f;
        String lowerCase = string.toLowerCase(Locale.ROOT);
        jc.i.d(lowerCase, "toLowerCase(...)");
        char[] cArr = {'[', ']'};
        int length = lowerCase.length() - i10;
        int i11 = 0;
        int i12 = 0;
        while (i11 <= length) {
            char cCharAt = lowerCase.charAt(i12 == 0 ? i11 : length);
            int i13 = 0;
            while (true) {
                if (i13 >= 2) {
                    i = i10;
                    i13 = -1;
                    break;
                }
                i = i10;
                if (cCharAt == cArr[i13]) {
                    break;
                }
                i13++;
                i10 = i;
            }
            int i14 = i13 >= 0 ? i : 0;
            if (i12 == 0) {
                if (i14 == 0) {
                    i10 = i;
                    i12 = i10;
                } else {
                    i11++;
                }
            } else {
                if (i14 == 0) {
                    break;
                }
                length--;
            }
            i10 = i;
        }
        String strZ0 = pc.g.z0(lowerCase.subSequence(i11, length + 1).toString());
        int iN0 = pc.g.n0(string, ':', 0, 6);
        if (iN0 > 0) {
            strSubstring = string.substring(iN0 + 1);
            jc.i.d(strSubstring, "substring(...)");
        } else {
            strSubstring = "80";
        }
        String str3 = strZ0 + ':' + strSubstring;
        Iterator it = ((LinkedHashMap) this.f1622d).entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = (String) entry.getKey();
                k3.r rVar3 = (k3.r) entry.getValue();
                if (!strZ0.equals(str4)) {
                    if (pc.o.Z(strZ0, "." + str4)) {
                    }
                }
                Log.i("krypt-router", "enrutado [" + strZ0 + "] → perfil '" + str4 + '\'');
                rVar3.getClass();
                jc.i.e(str3, "target");
                socketC = rVar3.c(str3);
                if (socketC == null) {
                    Log.w("krypt-router", "perfil '" + str4 + "' NO pudo tunelar " + str3);
                }
            } else if (h(strZ0)) {
                Log.i("krypt-router", "AdMob [" + strZ0 + "] → directo (protegido)");
                socketC = c(str3);
            } else if (rVar2 != null) {
                Log.i("krypt-router", "default [" + strZ0 + "] → perfil único (proxy del perfil)");
                jc.i.e(str3, "target");
                socketC = rVar2.c(str3);
            } else if (rVar != null) {
                Log.d("krypt-router", "default [" + strZ0 + "] → relay principal");
                jc.i.e(str3, "target");
                socketC = rVar.c(str3);
            } else {
                Log.d("krypt-router", "default [" + strZ0 + "] → directo");
                socketC = c(str3);
            }
            Socket socket2 = socketC;
            if (socket2 == null) {
                Log.w("krypt-router", "CONNECT " + string + " → 502");
                OutputStream outputStream = socket.getOutputStream();
                jc.i.d(outputStream, "getOutputStream(...)");
                m(outputStream, "HTTP/1.1 502 Bad Gateway\r\nConnection: close\r\n\r\n");
                return null;
            }
            try {
                OutputStream outputStream2 = socket.getOutputStream();
                jc.i.d(outputStream2, "getOutputStream(...)");
                m(outputStream2, "HTTP/1.1 200 Connection established\r\n\r\n");
                OutputStream outputStream3 = socket.getOutputStream();
                jc.i.d(outputStream3, "getOutputStream(...)");
                InputStream inputStream2 = socket2.getInputStream();
                jc.i.d(inputStream2, "getInputStream(...)");
                OutputStream outputStream4 = socket2.getOutputStream();
                jc.i.d(outputStream4, "getOutputStream(...)");
                j(inputStream, outputStream3, inputStream2, outputStream4);
                return socket2;
            } catch (Throwable th) {
                StringBuilder sbN = q1.a.n("túnel ", string, " interrumpido: ");
                sbN.append(th.getMessage());
                Log.d("krypt-router", sbN.toString());
                return socket2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0202  */
    /* JADX WARN: Code duplicated, block: B:75:0x0215  */
    /* JADX WARN: Code duplicated, block: B:78:0x0220  */
    /* JADX WARN: Code duplicated, block: B:82:0x0238  */
    /* JADX WARN: Code duplicated, block: B:84:0x023e  */
    /* JADX WARN: Code duplicated, block: B:87:0x024f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0252  */
    /* JADX WARN: Code duplicated, block: B:91:0x025e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0280  */
    /* JADX WARN: Code duplicated, block: B:96:0x02aa A[Catch: all -> 0x02f5, LOOP:3: B:95:0x02a8->B:96:0x02aa, LOOP_END, TryCatch #0 {all -> 0x02f5, blocks: (B:94:0x0281, B:96:0x02aa, B:97:0x02ce), top: B:101:0x0281 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01dd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x02aa, please report this as an issue */
    public Socket g(String str, InputStream inputStream, Socket socket) throws IOException {
        char c10;
        Socket socketC;
        boolean z4;
        int i;
        OutputStream outputStream;
        int size;
        String str2;
        String str3;
        String strSubstring;
        int iK0;
        int iJ0;
        Object next;
        Map.Entry entry;
        String string = str;
        k3.r rVar = (k3.r) this.e;
        k3.r rVar2 = (k3.r) this.f1623f;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1622d;
        String str4 = this.f1620b;
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strK = k(inputStream);
            if (strK == null || strK.length() == 0) {
                break;
            }
            arrayList.add(strK);
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            String str5 = (String) obj;
            if (!pc.o.e0(str5, "Proxy-Authorization:", true) && !pc.o.e0(str5, "Proxy-Connection:", true) && !pc.o.e0(str5, "Connection:", true) && !pc.o.e0(str5, "Keep-Alive:", true)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayListG0 = vb.i.g0(arrayList2, "Connection: close");
        String strConcat = (String) vb.i.b0(1, pc.g.v0(string, new char[]{' '}, 6));
        String str6 = null;
        if (strConcat == null) {
            c10 = ' ';
            strConcat = null;
        } else {
            c10 = ' ';
            int iK1 = pc.g.k0(strConcat, "://", 0, false, 6);
            if (iK1 >= 0) {
                strConcat = strConcat.substring(iK1 + 3);
                jc.i.d(strConcat, "substring(...)");
            }
            int iJ1 = pc.g.j0(strConcat, '/', 0, 6);
            if (iJ1 >= 0) {
                strConcat = strConcat.substring(0, iJ1);
                jc.i.d(strConcat, "substring(...)");
            }
            if (!pc.g.g0(strConcat, ':')) {
                strConcat = strConcat.concat(":80");
            }
        }
        if (strConcat == null) {
            return null;
        }
        String lowerCase = pc.g.z0(strConcat).toLowerCase(Locale.ROOT);
        jc.i.d(lowerCase, "toLowerCase(...)");
        k3.r rVar3 = (k3.r) linkedHashMap.get(lowerCase);
        if (rVar3 == null) {
            Iterator it = linkedHashMap.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                entry = (Map.Entry) next;
                if (lowerCase.equals(entry.getKey())) {
                    break;
                }
            } while (!pc.o.Z(lowerCase, "." + ((String) entry.getKey())));
            Map.Entry entry2 = (Map.Entry) next;
            rVar3 = entry2 != null ? (k3.r) entry2.getValue() : null;
        }
        if (rVar3 != null) {
            Log.i("krypt-router", "plain enrutado [" + lowerCase + "] → perfil");
            socketC = rVar3.c(strConcat);
        } else if (h(lowerCase)) {
            Log.i("krypt-router", "plain AdMob [" + lowerCase + "] → directo (protegido)");
            socketC = c(strConcat);
        } else if (rVar2 != null) {
            Log.i("krypt-router", "plain default [" + lowerCase + "] → perfil único");
            socketC = rVar2.c(strConcat);
        } else {
            if (rVar == null) {
                if (str4 != null) {
                    Log.d("krypt-router", "plain default [" + lowerCase + "] → proxy pelado " + str4);
                    socketC = c(str4);
                    z4 = false;
                } else {
                    Log.d("krypt-router", "plain default [" + lowerCase + "] → directo al origen");
                    socketC = c(strConcat);
                }
                if (socketC == null) {
                    Log.w("krypt-router", "plain " + strConcat + " → 502 (sin salida)");
                    OutputStream outputStream2 = socket.getOutputStream();
                    jc.i.d(outputStream2, "getOutputStream(...)");
                    m(outputStream2, "HTTP/1.1 502 Bad Gateway\r\n\r\n");
                    return null;
                }
                if (z4) {
                    List listV0 = pc.g.v0(string, new char[]{c10}, 6);
                    str2 = (String) vb.i.b0(0, listV0);
                    if (str2 == null) {
                        str2 = "GET";
                    }
                    str3 = (String) vb.i.b0(2, listV0);
                    if (str3 == null) {
                        str3 = "HTTP/1.1";
                    }
                    i = 0;
                    strSubstring = (String) vb.i.b0(1, pc.g.v0(string, new char[]{c10}, 6));
                    if (strSubstring != null) {
                        iK0 = pc.g.k0(strSubstring, "://", 0, false, 6);
                        if (iK0 >= 0) {
                            strSubstring = strSubstring.substring(iK0 + 3);
                            jc.i.d(strSubstring, "substring(...)");
                        }
                        iJ0 = pc.g.j0(strSubstring, '/', 0, 6);
                        if (iJ0 < 0) {
                            str6 = "/";
                        } else {
                            String strSubstring2 = strSubstring.substring(iJ0);
                            jc.i.d(strSubstring2, "substring(...)");
                            str6 = strSubstring2;
                        }
                    }
                    String str7 = str6 != null ? str6 : "/";
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    char c11 = c10;
                    sb2.append(c11);
                    sb2.append(str7);
                    sb2.append(c11);
                    sb2.append(str3);
                    string = sb2.toString();
                    jc.i.d(string, "toString(...)");
                } else {
                    i = 0;
                }
                try {
                    OutputStream outputStream3 = socket.getOutputStream();
                    outputStream = socketC.getOutputStream();
                    byte[] bytes = (string + "\r\n").getBytes(pc.a.f7847b);
                    jc.i.d(bytes, "getBytes(...)");
                    outputStream.write(bytes);
                    size = arrayListG0.size();
                    while (i < size) {
                        Object obj2 = arrayListG0.get(i);
                        i++;
                        byte[] bytes2 = (((String) obj2) + "\r\n").getBytes(pc.a.f7847b);
                        jc.i.d(bytes2, "getBytes(...)");
                        outputStream.write(bytes2);
                    }
                    byte[] bytes3 = "\r\n".getBytes(pc.a.f7847b);
                    jc.i.d(bytes3, "getBytes(...)");
                    outputStream.write(bytes3);
                    outputStream.flush();
                    jc.i.b(outputStream3);
                    InputStream inputStream2 = socketC.getInputStream();
                    jc.i.d(inputStream2, "getInputStream(...)");
                    OutputStream outputStream4 = socketC.getOutputStream();
                    jc.i.d(outputStream4, "getOutputStream(...)");
                    j(inputStream, outputStream3, inputStream2, outputStream4);
                } catch (Throwable unused) {
                }
                return socketC;
            }
            Log.d("krypt-router", "plain default [" + lowerCase + "] → relay principal");
            socketC = rVar.c(strConcat);
        }
        z4 = true;
        if (socketC == null) {
            Log.w("krypt-router", "plain " + strConcat + " → 502 (sin salida)");
            OutputStream outputStream5 = socket.getOutputStream();
            jc.i.d(outputStream5, "getOutputStream(...)");
            m(outputStream5, "HTTP/1.1 502 Bad Gateway\r\n\r\n");
            return null;
        }
        if (z4) {
            List listV1 = pc.g.v0(string, new char[]{c10}, 6);
            str2 = (String) vb.i.b0(0, listV1);
            if (str2 == null) {
                str2 = "GET";
            }
            str3 = (String) vb.i.b0(2, listV1);
            if (str3 == null) {
                str3 = "HTTP/1.1";
            }
            i = 0;
            strSubstring = (String) vb.i.b0(1, pc.g.v0(string, new char[]{c10}, 6));
            if (strSubstring != null) {
                iK0 = pc.g.k0(strSubstring, "://", 0, false, 6);
                if (iK0 >= 0) {
                    strSubstring = strSubstring.substring(iK0 + 3);
                    jc.i.d(strSubstring, "substring(...)");
                }
                iJ0 = pc.g.j0(strSubstring, '/', 0, 6);
                if (iJ0 < 0) {
                    str6 = "/";
                } else {
                    String strSubstring3 = strSubstring.substring(iJ0);
                    jc.i.d(strSubstring3, "substring(...)");
                    str6 = strSubstring3;
                }
            }
            if (str6 != null) {
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            char c12 = c10;
            sb3.append(c12);
            sb3.append(str7);
            sb3.append(c12);
            sb3.append(str3);
            string = sb3.toString();
            jc.i.d(string, "toString(...)");
        } else {
            i = 0;
        }
        OutputStream outputStream6 = socket.getOutputStream();
        outputStream = socketC.getOutputStream();
        byte[] bytes4 = (string + "\r\n").getBytes(pc.a.f7847b);
        jc.i.d(bytes4, "getBytes(...)");
        outputStream.write(bytes4);
        size = arrayListG0.size();
        while (i < size) {
            Object obj3 = arrayListG0.get(i);
            i++;
            byte[] bytes5 = (((String) obj3) + "\r\n").getBytes(pc.a.f7847b);
            jc.i.d(bytes5, "getBytes(...)");
            outputStream.write(bytes5);
        }
        byte[] bytes6 = "\r\n".getBytes(pc.a.f7847b);
        jc.i.d(bytes6, "getBytes(...)");
        outputStream.write(bytes6);
        outputStream.flush();
        jc.i.b(outputStream6);
        InputStream inputStream3 = socketC.getInputStream();
        jc.i.d(inputStream3, "getInputStream(...)");
        OutputStream outputStream7 = socketC.getOutputStream();
        jc.i.d(outputStream7, "getOutputStream(...)");
        j(inputStream, outputStream6, inputStream3, outputStream7);
        return socketC;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    public void i(o oVar, String str) {
        int i;
        int iF;
        int i10;
        char cCharAt;
        ArrayList arrayList = (ArrayList) this.h;
        byte[] bArr = cd.b.f1822a;
        int iM = cd.b.m(0, str.length(), str);
        int iN = cd.b.n(iM, str.length(), str);
        if (iN - iM < 2) {
            i = -1;
            break;
        }
        char cCharAt2 = str.charAt(iM);
        if ((jc.i.f(cCharAt2, 97) < 0 || jc.i.f(cCharAt2, 122) > 0) && (jc.i.f(cCharAt2, 65) < 0 || jc.i.f(cCharAt2, 90) > 0)) {
            i = -1;
            break;
        }
        i = iM + 1;
        while (true) {
            if (i < iN) {
                char cCharAt3 = str.charAt(i);
                if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    if (cCharAt3 != ':') {
                        break;
                    } else {
                        break;
                    }
                }
                i++;
            }
            i = -1;
            break;
        }
        if (i == -1) {
            if (oVar == null) {
                throw new IllegalArgumentException(u3.b.b("Expected URL scheme 'http' or 'https' but no scheme was found for ", str.length() > 6 ? pc.g.A0(6, str).concat("...") : str));
            }
            this.f1620b = oVar.f1626a;
        } else if (pc.o.d0(str, iM, "https:", true)) {
            this.f1620b = ProxyConfig.MATCH_HTTPS;
            iM += 6;
        } else {
            if (!pc.o.d0(str, iM, "http:", true)) {
                StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String strSubstring = str.substring(0, i);
                jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring);
                sb2.append('\'');
                throw new IllegalArgumentException(sb2.toString());
            }
            this.f1620b = ProxyConfig.MATCH_HTTP;
            iM += 5;
        }
        int i11 = 0;
        for (int i12 = iM; i12 < iN && ((cCharAt = str.charAt(i12)) == '\\' || cCharAt == '/'); i12++) {
            i11++;
        }
        char c10 = '#';
        if (i11 >= 2 || oVar == null || !jc.i.a(oVar.f1626a, this.f1620b)) {
            int i13 = iM + i11;
            boolean z4 = false;
            boolean z10 = false;
            while (true) {
                iF = cd.b.f(i13, iN, str, "@/\\?#");
                byte bCharAt = iF != iN ? str.charAt(iF) : (byte) -1;
                if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z4) {
                        this.e = ((String) this.e) + "%40" + b.b(i13, iF, 240, str, " \"':;<=>@[]^`{}|/\\?#");
                        z4 = z4;
                    } else {
                        boolean z11 = z4;
                        int iG = cd.b.g(str, ':', i13, iF);
                        String strB = b.b(i13, iG, 240, str, " \"':;<=>@[]^`{}|/\\?#");
                        if (z10) {
                            strB = ((String) this.f1622d) + "%40" + strB;
                        }
                        this.f1622d = strB;
                        if (iG != iF) {
                            this.e = b.b(iG + 1, iF, 240, str, " \"':;<=>@[]^`{}|/\\?#");
                            z4 = true;
                        } else {
                            z4 = z11;
                        }
                        z10 = true;
                    }
                    i13 = iF + 1;
                    c10 = '#';
                }
            }
            int i14 = i13;
            while (true) {
                if (i14 >= iF) {
                    i14 = iF;
                    break;
                }
                char cCharAt4 = str.charAt(i14);
                if (cCharAt4 != '[') {
                    if (cCharAt4 == ':') {
                        break;
                    }
                } else {
                    do {
                        i14++;
                        if (i14 >= iF) {
                            break;
                        }
                    } while (str.charAt(i14) != ']');
                }
                i14++;
            }
            int i15 = i14 + 1;
            if (i15 < iF) {
                this.f1623f = n9.b.D(b.e(i13, i14, str, 4));
                try {
                    i10 = Integer.parseInt(b.b(i15, iF, 248, str, ""));
                    if (1 > i10 || i10 >= 65536) {
                        i10 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f1621c = i10;
                if (i10 == -1) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = str.substring(i15, iF);
                    jc.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb3.append(strSubstring2);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
            } else {
                this.f1623f = n9.b.D(b.e(i13, i14, str, 4));
                String str2 = this.f1620b;
                jc.i.b(str2);
                this.f1621c = str2.equals(ProxyConfig.MATCH_HTTP) ? 80 : str2.equals(ProxyConfig.MATCH_HTTPS) ? 443 : -1;
            }
            if (((String) this.f1623f) == null) {
                StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = str.substring(i13, i14);
                jc.i.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb4.append(strSubstring3);
                sb4.append('\"');
                throw new IllegalArgumentException(sb4.toString().toString());
            }
            iM = iF;
        } else {
            this.f1622d = oVar.e();
            this.e = oVar.a();
            this.f1623f = oVar.f1629d;
            this.f1621c = oVar.e;
            arrayList.clear();
            arrayList.addAll(oVar.c());
            if (iM == iN || str.charAt(iM) == '#') {
                String strD = oVar.d();
                this.i = strD != null ? b.f(b.b(0, 0, 211, strD, " \"'<>#")) : null;
            }
        }
        int iF2 = cd.b.f(iM, iN, str, "?#");
        if (iM != iF2) {
            char cCharAt5 = str.charAt(iM);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iM++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iM < iF2) {
                int iF3 = cd.b.f(iM, iF2, str, "/\\");
                boolean z12 = iF3 < iF2;
                String strB2 = b.b(iM, iF3, 240, str, " \"<>^`{}|/\\?#");
                if (!strB2.equals(".") && !strB2.equalsIgnoreCase("%2e")) {
                    if (!strB2.equals("..") && !strB2.equalsIgnoreCase("%2e.") && !strB2.equalsIgnoreCase(".%2e") && !strB2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strB2);
                        } else {
                            arrayList.add(strB2);
                        }
                        if (z12) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iM = z12 ? iF3 + 1 : iF3;
            }
        }
        if (iF2 < iN && str.charAt(iF2) == '?') {
            int iG2 = cd.b.g(str, '#', iF2, iN);
            this.i = b.f(b.b(iF2 + 1, iG2, 208, str, " \"'<>#"));
            iF2 = iG2;
        }
        if (iF2 >= iN || str.charAt(iF2) != '#') {
            return;
        }
        this.f1624g = b.b(iF2 + 1, iN, 176, str, "");
    }

    public void j(InputStream inputStream, OutputStream outputStream, InputStream inputStream2, OutputStream outputStream2) throws InterruptedException {
        Thread thread = new Thread(new k3.q(inputStream, outputStream2, this, inputStream2, 0));
        thread.setDaemon(true);
        thread.setName("krypt-pump");
        thread.start();
        try {
            qd.b.n(inputStream2, outputStream, 32768);
            outputStream.flush();
        } catch (Throwable unused) {
        }
        b(outputStream);
        b(inputStream);
        thread.join(5000L);
    }

    public boolean l() {
        String str;
        synchronized (this.i) {
            ServerSocket serverSocket = (ServerSocket) this.h;
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
                this.h = serverSocket2;
                this.f1621c = serverSocket2.getLocalPort();
                StringBuilder sb2 = new StringBuilder("router arriba en :");
                sb2.append(this.f1621c);
                sb2.append(" rutas=");
                sb2.append(((LinkedHashMap) this.f1622d).keySet());
                sb2.append(" default=");
                if (((k3.r) this.f1623f) != null) {
                    str = "perfil-único";
                } else if (((k3.r) this.e) != null) {
                    str = "main-relay";
                } else {
                    str = this.f1620b;
                    if (str == null) {
                        str = "directo";
                    }
                }
                sb2.append(str);
                Log.i("krypt-router", sb2.toString());
                ((ExecutorService) this.f1624g).execute(new androidx.webkit.b(7, serverSocket2, this));
            } catch (Throwable th) {
                Log.w("krypt-router", "no pudo iniciar router: " + th);
                z4 = false;
            }
            return z4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    public String toString() {
        switch (this.f1619a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                String str = this.f1620b;
                if (str != null) {
                    sb2.append(str);
                    sb2.append("://");
                } else {
                    sb2.append("//");
                }
                if (((String) this.f1622d).length() > 0 || ((String) this.e).length() > 0) {
                    sb2.append((String) this.f1622d);
                    if (((String) this.e).length() > 0) {
                        sb2.append(':');
                        sb2.append((String) this.e);
                    }
                    sb2.append('@');
                }
                String str2 = (String) this.f1623f;
                if (str2 != null) {
                    if (pc.g.g0(str2, ':')) {
                        sb2.append('[');
                        sb2.append((String) this.f1623f);
                        sb2.append(']');
                    } else {
                        sb2.append((String) this.f1623f);
                    }
                }
                int i = -1;
                if (this.f1621c != -1 || this.f1620b != null) {
                    int iD = d();
                    String str3 = this.f1620b;
                    if (str3 == null) {
                        sb2.append(':');
                        sb2.append(iD);
                    } else {
                        if (str3.equals(ProxyConfig.MATCH_HTTP)) {
                            i = 80;
                        } else if (str3.equals(ProxyConfig.MATCH_HTTPS)) {
                            i = 443;
                        }
                        if (iD != i) {
                            sb2.append(':');
                            sb2.append(iD);
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) this.h;
                jc.i.e(arrayList, "<this>");
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append('/');
                    sb2.append((String) arrayList.get(i10));
                }
                if (((ArrayList) this.i) != null) {
                    sb2.append('?');
                    ArrayList arrayList2 = (ArrayList) this.i;
                    jc.i.b(arrayList2);
                    mc.d dVarJ = jd.d.J(jd.d.L(0, arrayList2.size()), 2);
                    int i11 = dVarJ.f7106a;
                    int i12 = dVarJ.f7107b;
                    int i13 = dVarJ.f7108c;
                    if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i11);
                            String str5 = (String) arrayList2.get(i11 + 1);
                            if (i11 > 0) {
                                sb2.append('&');
                            }
                            sb2.append(str4);
                            if (str5 != null) {
                                sb2.append('=');
                                sb2.append(str5);
                            }
                            if (i11 != i12) {
                                i11 += i13;
                            }
                        }
                    }
                }
                if (((String) this.f1624g) != null) {
                    sb2.append('#');
                    sb2.append((String) this.f1624g);
                }
                String string = sb2.toString();
                jc.i.d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public n() {
        this.f1619a = 0;
        this.f1622d = "";
        this.e = "";
        this.f1621c = -1;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.add("");
    }
}
