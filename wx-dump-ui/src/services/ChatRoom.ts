// @ts-ignore
/* eslint-disable */
import {request} from 'umi';

export async function queryChatRoom(params: ChatRoomParams, options?: { [key: string]: any }) {
  return request<Response<ChatRoomItem[]>>('/api/chatroom/list', {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json',
    },
    params: {
      ...params,
    },
    ...(options || {}),
  });
}

export async function queryChatRoomDetail(
  params: {
    chatRoomName?: string;
  },
  options?: { [key: string]: any },
) {
  return request<Response<ChatRoomDetail>>('/api/chatroom/detail', {
    method: 'GET',
    params: {
      ...params,
    },
    ...(options || {}),
  });
}

export async function exportChatRooms(options?: { [key: string]: any }) {
  return request<Response<string>>('/api/chatroom/export', {
    method: 'GET',
    ...(options || {}),
  });
}

export async function exportChatRoomMembers(params: { chatRoomName?: string;}, options?: { [key: string]: any }) {
  return request<Response<string>>('/api/chatroom/export/members', {
    method: 'GET',
    params: {
      ...params,
    },
    ...(options || {}),
  });
}
